package com.tech55.assignment.promotion.factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(){   
		return new PromotionHandlerFactory();         
	}
}
