package vn.edu.iuh.fit.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.edu.iuh.fit.productservice.model.Product;


@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends JpaRepository<Product, Long> {
}