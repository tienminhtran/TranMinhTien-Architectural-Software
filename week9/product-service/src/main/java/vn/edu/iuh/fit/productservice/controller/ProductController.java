package vn.edu.iuh.fit.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.productservice.model.Product;
import vn.edu.iuh.fit.productservice.service.ProductService;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable Long id) {
        Map<String, Object> response = new LinkedHashMap<>();
       try {
           Product p = productService.findByID(id);
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
    public ResponseEntity<Map<String, Object>> save(@RequestBody Product product) {
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            Product savedProduct = productService.save(product);
            response.put("status", HttpStatus.CREATED.value());
            response.put("message", "Product created successfully!");
            response.put("data", savedProduct);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (IllegalArgumentException ex) {
            response.put("status", HttpStatus.BAD_REQUEST.value());
            response.put("message", ex.getMessage());
            return ResponseEntity.badRequest().body(response);
        } catch (Exception ex) {
            response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Đã xảy ra lỗi không mong muốn");
            response.put("error", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}