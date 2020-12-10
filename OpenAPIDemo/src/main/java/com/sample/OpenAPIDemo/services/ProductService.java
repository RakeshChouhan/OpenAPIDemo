package com.sample.OpenAPIDemo.services;

import com.sample.OpenAPIDemo.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public List<Product> getAllProducts();
    public Product findProductById(Long productId);
    public void saveProduct(Product product);
    public void deleteProduct(Long productId);

}
