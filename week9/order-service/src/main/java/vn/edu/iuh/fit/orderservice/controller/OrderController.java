package vn.edu.iuh.fit.orderservice.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.orderservice.model.Order;
import vn.edu.iuh.fit.orderservice.service.OrderService;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Long id) {
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            Order p = orderService.getOrderById(id);
            response.put("status", HttpStatus.BAD_REQUEST.value());
            response.put("data", p);
            return ResponseEntity.ok().body(response);
        }catch (Exception ex){
            response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Đã xảy ra lỗi không mong muốn ở phía server");
            response.put("error", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Map<String, Object>> save(@RequestBody Order o) {
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            Order order = orderService.createOrder(o);
            if (order == null) {
                response.put("status", HttpStatus.NOT_FOUND.value());
                response.put("message", "Product not found or invalid");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
            }

            response.put("status", HttpStatus.CREATED.value());
            response.put("message", "Order created successfully!");
            response.put("data", order);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException ex) {
            // Sản phẩm không hợp lệ hoặc không tìm thấy
            response.put("status", HttpStatus.BAD_REQUEST.value());
            response.put("message", "Sản phẩm không hợp lệ hoặc không tồn tại.");
            response.put("error", ex.getMessage());
            return ResponseEntity.badRequest().body(response);
        } catch (IllegalStateException ex) {
            // Service không phản hồi (có thể do down)
            response.put("status", HttpStatus.SERVICE_UNAVAILABLE.value());
            response.put("message", "Dịch vụ sản phẩm không khả dụng. Vui lòng thử lại sau.");
            response.put("error", ex.getMessage());
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
        } catch (Exception ex) {
            // Các lỗi còn lại
            response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Đã xảy ra lỗi không mong muốn.");
            response.put("error", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}