package com.tech55.assignment.businessObject;


import com.tech55.assignment.businessObject.impl.BasketBOImpl;
import com.tech55.assignment.businessObject.impl.PromotionBOImpl;

public interface CheckoutBO {
	public void scan(BasketBOImpl b);
	public int total();
	public void applyPromo(PromotionBOImpl promo);

}
