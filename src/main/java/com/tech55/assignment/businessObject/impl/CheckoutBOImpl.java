package com.tech55.assignment.businessObject.impl;

import java.util.Map;

import com.tech55.assignment.basket.Offer;
import com.tech55.assignment.basket.Product;
import com.tech55.assignment.businessObject.CheckoutBO;
import com.tech55.assignment.businessObject.OfferHandlerBO;
import com.tech55.assignment.promotion.factory.AbstractFactory;
import com.tech55.assignment.promotion.factory.FactoryProducer;
import com.tech55.assignment.promotion.handler.PromotionHandler;


public class CheckoutBOImpl implements CheckoutBO {
	
	private OfferHandlerBO offer_handler;
	private int total_price;
	
	public CheckoutBOImpl(OfferHandlerBO offer_handler) {
		this.offer_handler = offer_handler;
	}
	
	@Override
	public int total() {
		return total_price;
	}

	@Override
	public void scan(BasketBOImpl b) {
		Map<Product, Integer> map =b.getItems();
		int total_price =0;
		for(Map.Entry<Product, Integer> entry : map.entrySet()) {
			Product product = entry.getKey();
			int quantity = entry.getValue();
			int productNetPrice = 0;
			if(offer_handler != null) {
				Offer offer = offer_handler.getOffer(product.getSku());
				if(offer != null) {
					while(quantity >= offer.getQuantity()) {
						productNetPrice += offer.getPrice();
						quantity-=offer.getQuantity();
					}
					if(quantity>0) {
						productNetPrice = productNetPrice + (product.getPrice()*quantity);
					}
				}
			}
			if(productNetPrice == 0) {
				productNetPrice = product.getPrice()*quantity;
			}
			//System.out.println(product.getName()+" "+ productNetPrice);
			total_price += productNetPrice;
		}
		
		this.total_price = total_price;
	}

	@Override
	public void applyPromo(PromotionBOImpl promo) {
		if(total_price > 0) {
			AbstractFactory promotionfactory = FactoryProducer.getFactory();
			PromotionHandler promohandler = promotionfactory.getPromotionHandler(promo.getPromoType().getPromoName());
			total_price = promohandler.applyPromotionDiscount(total_price, promo);
		}
	}

}
