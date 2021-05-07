package com.example.ProductManage.service;

import com.example.ProductManage.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    Product findByName(String name);
    void update(int id, Product product);
    void remove(int id);

}
