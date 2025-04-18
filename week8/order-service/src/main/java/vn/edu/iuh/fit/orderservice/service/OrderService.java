package vn.edu.iuh.fit.orderservice.service;


import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.orderservice.model.Order;
import vn.edu.iuh.fit.orderservice.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order save(Order order) {
        return repository.save(order);
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Optional<Order> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}