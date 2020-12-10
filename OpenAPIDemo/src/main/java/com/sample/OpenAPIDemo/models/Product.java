package com.sample.OpenAPIDemo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public @Data class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name="product_price")
    private double price;
}
