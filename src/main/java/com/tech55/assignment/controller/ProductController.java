package com.tech55.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tech55.assignment.basket.Product;
import com.tech55.assignment.repository.ProductRepository;

@RestController
public class ProductController {
	
	
	@Autowired
	private ProductRepository repo;
	
	
	@GetMapping("/products")
    public List<Product> listAll() {
        return repo.findAll();
    }
	
	@GetMapping("/products/{sku}")
    public Product getProduct(@PathVariable int sku) {
        return repo.findBySku(sku);
    }
}
