package com.example.again_security.services;

import com.example.again_security.dao.ProductDAO;
import com.example.again_security.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("psi2")
@AllArgsConstructor
public class ProductServiceImpl2 implements ProductService {
    private ProductDAO productDAO;

    @Override
    public void save(Product product) throws Exception {
        if (product != null) {
            productDAO.save(product);
        } else {
            throw new Exception();
        }
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findOneById(int id) {
        if (id > 0) {
            return productDAO.findById(id).get();
        }
        return null;
    }
}
