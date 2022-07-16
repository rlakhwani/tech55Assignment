package com.tech55.assignment.basket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promotiontype")
public class PromotionType {
	
	@Id
	@Column(name="promo_type_id")
	private long promoTypeId;
	
	@Column(name="promo_name")
	private String promoName;
	
	@Column(name="promo_value")
	private int promoValue;
	
	public PromotionType() {}
	public PromotionType(int promoTypeId, String promoName, int promoValue) {
		super();
		this.promoTypeId = promoTypeId;
		this.promoName = promoName;
		this.promoValue = promoValue;
	}
	
	
	public long getPromoTypeId() {
		return promoTypeId;
	}

	public void setPromoTypeId(long promoTypeId) {
		this.promoTypeId = promoTypeId;
	}

	public String getPromoName() {
		return promoName;
	}
	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}
	public int getPromoValue() {
		return promoValue;
	}
	public void setPromoValue(int promoValue) {
		this.promoValue = promoValue;
	}
	
	
}
