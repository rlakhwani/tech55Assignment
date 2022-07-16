package com.tech55.assignment.repository;

import com.tech55.assignment.businessObject.impl.BasketBOImpl;

public interface BasketLineItemBORepo {
	public BasketBOImpl getBasketBOImpl(int basketid);
}
