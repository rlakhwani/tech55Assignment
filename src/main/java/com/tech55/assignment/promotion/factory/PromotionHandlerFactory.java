package com.tech55.assignment.promotion.factory;

import com.tech55.assignment.promotion.handler.PromotionHandler;
import com.tech55.assignment.promotion.handler.impl.PromotionPercentageHandlerImpl;
import com.tech55.assignment.promotion.handler.impl.PromotionValueOffHandlerImpl;

public class PromotionHandlerFactory extends AbstractFactory{

	@Override
	public PromotionHandler getPromotionHandler(String handlerType) {
		if(handlerType.equalsIgnoreCase("Percentage")){
	         return new PromotionPercentageHandlerImpl();         
	      }else if(handlerType.equalsIgnoreCase("ValueOff")){
	         return new PromotionValueOffHandlerImpl();
	      }
		return null;
	}

}
