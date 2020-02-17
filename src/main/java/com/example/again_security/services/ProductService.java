package com.example.again_security.services;

import com.example.again_security.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    void save(Product product) throws Exception;
    List<Product> findAll();
    Product findOneById(int id);
}
