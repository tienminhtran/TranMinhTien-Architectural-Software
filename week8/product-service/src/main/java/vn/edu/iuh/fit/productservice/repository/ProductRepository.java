package vn.edu.iuh.fit.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}