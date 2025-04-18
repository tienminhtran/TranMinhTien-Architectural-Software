package vn.edu.iuh.fit.orderservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.orderservice.model.Order;
import vn.edu.iuh.fit.orderservice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getById(@PathVariable Long id) {
        return orderService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> update(@PathVariable Long id, @RequestBody Order updatedOrder) {
        return orderService.findById(id)
                .map(order -> {
                    order.setCustomerId(updatedOrder.getCustomerId());
                    order.setTotalAmount(updatedOrder.getTotalAmount());
                    order.setStatus(updatedOrder.getStatus());
                    return ResponseEntity.ok(orderService.save(order));
                })
                .orElse(ResponseEntity.notFound().build());
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id) {
//        return orderService.findById(id)
//                .map(order -> {
//                    orderService.delete(id);
//                    return ResponseEntity.noContent().build();
//                })
//                .orElse(ResponseEntity.notFound().build());
//    }
}