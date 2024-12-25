package com.learn.SpringEcom.service;

import com.learn.SpringEcom.Repo.ProductRepo;
import com.learn.SpringEcom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
            return productRepo.findAll();
    }
}
