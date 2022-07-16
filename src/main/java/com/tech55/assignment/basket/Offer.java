package com.tech55.assignment.basket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer")
public class Offer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@Column(name="offer_Id")
	private long offerId;

	@Column(name="product_sku")
	private int productSku;
    
	@Column(name="offer_quantity")
	private int quantity;
	
	@Column(name="offer_price")
    private int price;

    public Offer() {}
    public Offer(int productSku, int quantity, int price) {
        super();
        this.productSku = productSku;
        this.quantity = quantity;
        this.price = price;
    }
    
    public int getProductSku() {
		return productSku;
	}
	public void setProductSku(int productSku) {
		this.productSku = productSku;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    public long getOfferId() {
		return offerId;
	}
	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}
	
	@Override
    public String toString() {
        return "Offer [ productSku=" + productSku + ", quantity=" + quantity + ", price=" + price + "]";
    }

}
