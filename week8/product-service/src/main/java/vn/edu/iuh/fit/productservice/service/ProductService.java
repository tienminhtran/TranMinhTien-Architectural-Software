package vn.edu.iuh.fit.productservice.service;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.productservice.model.Product;
import vn.edu.iuh.fit.productservice.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}