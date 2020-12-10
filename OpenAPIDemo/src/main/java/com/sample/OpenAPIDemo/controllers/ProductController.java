package com.sample.OpenAPIDemo.controllers;

import com.sample.OpenAPIDemo.models.Product;
import com.sample.OpenAPIDemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    public void setProductService(ProductService service) {
        this.service = service;
    }

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/product/{productId}")
    public Product findProductById(Long productId) {
        return service.findProductById(productId);
    }

    @PostMapping("/product")
    public boolean saveProduct(@RequestBody Product product) {
        service.saveProduct(product);
        return true;
    }

    @DeleteMapping("/product/{productId}")
    public boolean deleteProduct(Long productId) {
        service.deleteProduct(productId);
        return true;

    }

}
