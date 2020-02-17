package com.example.again_security.dao;

import com.example.again_security.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}
