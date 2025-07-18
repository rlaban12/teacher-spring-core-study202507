package com.spring.core.chap02_3.service;

import com.spring.core.chap02_3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public String findProduct() {
        return "데이터정제: " + repository.findProduct();
    }
}
