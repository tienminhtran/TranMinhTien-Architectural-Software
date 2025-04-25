package vn.edu.iuh.fit.productservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.productservice.model.Product;
import vn.edu.iuh.fit.productservice.repository.ProductRepository;
import vn.edu.iuh.fit.productservice.service.ProductService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findByID(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}