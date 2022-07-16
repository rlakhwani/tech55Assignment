package com.tech55.assignment.promotion.handler;

import com.tech55.assignment.businessObject.impl.PromotionBOImpl;

public interface PromotionHandler {
	public int applyPromotionDiscount(int total_price,PromotionBOImpl promo);
}
