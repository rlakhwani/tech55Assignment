package com.tech55.assignment.basket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="basketitem")
public class BasketLineItem {
	
	@Id
	@Column(name="line_item_Id")
	private int line_item_Id;
	
	@Column(name="basketid")
	private int basketid;
	@Column(name="product_sku")
	private int productSku;
	@Column(name="product_quantity")
	private int productQuantity;
	
	
	public BasketLineItem() {
		super();
	}


	public BasketLineItem(int line_item_Id, int basketid, int productSku, int productQuantity) {
		super();
		this.line_item_Id = line_item_Id;
		this.basketid = basketid;
		this.productSku = productSku;
		this.productQuantity = productQuantity;
	}


	public int getLine_item_Id() {
		return line_item_Id;
	}


	public void setLine_item_Id(int line_item_Id) {
		this.line_item_Id = line_item_Id;
	}


	public int getBasketid() {
		return basketid;
	}


	public void setBasketid(int basketid) {
		this.basketid = basketid;
	}


	public int getProductSku() {
		return productSku;
	}


	public void setProductSku(int productSku) {
		this.productSku = productSku;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	
}
