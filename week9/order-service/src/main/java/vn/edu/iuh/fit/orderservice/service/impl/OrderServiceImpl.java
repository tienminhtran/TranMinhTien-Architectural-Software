package vn.edu.iuh.fit.orderservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.orderservice.model.Order;
import vn.edu.iuh.fit.orderservice.repository.OrderRepository;
import vn.edu.iuh.fit.orderservice.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;


    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, RestTemplate restTemplate) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(name = "productServiceCircuitBreaker", fallbackMethod = "productServiceFallback")
    @Retry(name = "productServiceRetry")
    @RateLimiter(name = "productServiceRateLimiter")
    @Override
    public Order createOrder(Order order) {
        try {
            String url = "http://localhost:8001/api/product/" + order.getProduct();
            ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                Map<String, Object> body = response.getBody();
                if (body != null && body.get("data") != null) {
                    return orderRepository.save(order);
                }else {
                    throw new IllegalArgumentException("Product not found");
                }
            }else{
                throw new IllegalStateException("Product service returned non-success status: " + response.getStatusCode());
            }
        }catch (ResourceAccessException ex) {
            // Trường hợp service không khởi động hoặc không kết nối được
            System.err.println("Không thể kết nối đến dịch vụ sản phẩm: " + ex.getMessage());
            throw new IllegalStateException("Product service unavailable");
        } catch (Exception ex) {
            System.err.println("Lỗi khi gọi dịch vụ sản phẩm: " + ex.getMessage());
            throw new IllegalArgumentException("Product not found or invalid");
        }
    }

    public Order productServiceFallback(Order order, Throwable throwable) {
        System.err.println("Fallback gọi vì lỗi: " + throwable.getMessage());
        // Có thể trả về null, hoặc một đơn hàng đặc biệt báo lỗi, hoặc ném lỗi tùy ý
        throw new RuntimeException("Fallback: Không thể xử lý đơn hàng do dịch vụ sản phẩm lỗi");
    }


    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
