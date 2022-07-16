package com.tech55.assignment.businessObject.impl;

import com.tech55.assignment.basket.PromotionType;
import com.tech55.assignment.businessObject.PromotionBO;

public class PromotionBOImpl implements PromotionBO{
	private String promoCode;
	private PromotionType promoType;
	
	
	
	public PromotionBOImpl() {
		super();
	}
	public PromotionBOImpl(String promoCode, PromotionType promoType) {
		super();
		this.promoCode = promoCode;
		this.promoType = promoType;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public PromotionType getPromoType() {
		return promoType;
	}
	public void setPromoType(PromotionType promoType) {
		this.promoType = promoType;
	}
	
	
}
