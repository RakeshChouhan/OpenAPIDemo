package com.sample.OpenAPIDemo.services;

import com.sample.OpenAPIDemo.models.Product;
import com.sample.OpenAPIDemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product findProductById(Long productId) {
        return repository.findById(productId).get();
    }

    @Override
    public void saveProduct(Product product) {
        repository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        repository.deleteById(productId);

    }
}
