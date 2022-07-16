package com.tech55.assignment.basket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="product_price")
    private int price;
	
	@Id
	@Column(name="product_sku")
    private int sku;
    
	//default constructor
	public Product() {}
	//generating constructor using fields
	public Product(String name, int price, int sku) {
		super();
		this.name = name;
		this.price = price;
		this.sku = sku;
	}
	
	//generating getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}
}
