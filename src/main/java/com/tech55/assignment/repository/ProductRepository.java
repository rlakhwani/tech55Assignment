package com.tech55.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech55.assignment.basket.Product;

public interface ProductRepository extends JpaRepository<Product, Long>
{
	Product findBySku(int sku);
}

