package com.tech55.assignment.promotion.handler.impl;

import com.tech55.assignment.businessObject.impl.PromotionBOImpl;
import com.tech55.assignment.promotion.handler.PromotionHandler;

public class PromotionPercentageHandlerImpl implements PromotionHandler {
	
	@Override
	public int applyPromotionDiscount(int total_price,PromotionBOImpl promo) {
		return total_price - total_price*promo.getPromoType().getPromoValue()/100;
	}
}
