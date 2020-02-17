package com.example.again_security.controllers;

import com.example.again_security.models.Product;
import com.example.again_security.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

//    public ProductController(@Qualifier("psi1") ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable int id){
        return  productService.findOneById(id);
    }

//    @PostMapping("/save")
//    public List<Product> save(@RequestBody Product product) {
//        return productService.findAll();
//    }
//
//    @GetMapping("/products")
//    public List<Product> findAll() {
//        return productService.findAll();
//    }
}
