package com.example.again_security.services;

import com.example.again_security.dao.ProductDAO;
import com.example.again_security.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("psi1")
@AllArgsConstructor
public class ProductServiceImpl1 implements ProductService{
    private ProductDAO productDAO;
    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findOneById(int id) {
        return productDAO.findById(id).get();
    }
}
