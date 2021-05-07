package com.example.ProductManage.service;

import com.example.ProductManage.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImplement implements ProductService {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Man hinh", 2000000, "White", "LG"));
        products.put(2, new Product(2, "Man hinh", 2000000, "White", "LG"));
        products.put(3, new Product(3, "Man hinh", 2000000, "White", "LG"));
        products.put(4, new Product(4, "Man hinh", 2000000, "White", "LG"));
        products.put(5, new Product(5, "Man hinh", 2000000, "White", "LG"));
        products.put(6, new Product(6, "Man hinh", 2000000, "White", "LG"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
