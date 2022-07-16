package com.tech55.assignment.businessObject;

import java.util.Map;

import com.tech55.assignment.basket.Product;

public interface BasketBO {

	public Map<Product, Integer> getItems();
	public void addProduct(Product product);
	public void addProduct(Product product, int quantity);
	public void removeProduct(Product product);
	public void removeProduct(Product product, int quantity);
}
