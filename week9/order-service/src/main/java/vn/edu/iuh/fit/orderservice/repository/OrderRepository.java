package vn.edu.iuh.fit.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.edu.iuh.fit.orderservice.model.Order;

@RepositoryRestResource(collectionResourceRel = "order", path = "order")
public interface OrderRepository extends JpaRepository<Order, Long> {
}