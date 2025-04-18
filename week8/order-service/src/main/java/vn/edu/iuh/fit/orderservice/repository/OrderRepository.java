package vn.edu.iuh.fit.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}