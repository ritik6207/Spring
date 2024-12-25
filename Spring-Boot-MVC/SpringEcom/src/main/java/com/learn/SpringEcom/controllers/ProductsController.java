package com.learn.SpringEcom.controllers;

import com.learn.SpringEcom.model.Product;
import com.learn.SpringEcom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
// @CrossOrigin
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }
}
