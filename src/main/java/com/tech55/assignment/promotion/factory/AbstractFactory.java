package com.tech55.assignment.promotion.factory;

import com.tech55.assignment.promotion.handler.PromotionHandler;

public abstract class AbstractFactory {
	public abstract PromotionHandler getPromotionHandler(String handlerType) ;
}
