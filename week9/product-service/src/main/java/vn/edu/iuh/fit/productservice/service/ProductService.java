package vn.edu.iuh.fit.productservice.service;

import vn.edu.iuh.fit.productservice.model.Product;

public interface ProductService {
    public Product findByID(Long id);
    public Product save(Product product);
}
