package com.tech55.assignment.basket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promotion")
public class Promotion {
	
	@Id
	@Column(name="promo_id")
	private int promoId;
	
	@Column(name="promo_Code")
	private String promoCode;
	
	@Column(name="promo_Type_Id")
	private long promoTypeId;
	
	public Promotion() {}
	public Promotion(int promoId, String  promoCode, long promoTypeId) {
		super();
		this.promoId = promoId;
		this.promoCode = promoCode;
		this.promoTypeId = promoTypeId;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public long getPromoTypeId() {
		return promoTypeId;
	}

	public void setPromoTypeId(long promoTypeId) {
		this.promoTypeId = promoTypeId;
	}

	public int getPromoId() {
		return promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}
	
	
	
}
