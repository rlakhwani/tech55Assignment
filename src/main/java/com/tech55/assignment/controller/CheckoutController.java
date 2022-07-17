package com.tech55.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.tech55.assignment.businessObject.CheckoutBO;
import com.tech55.assignment.businessObject.OfferHandlerBO;
import com.tech55.assignment.businessObject.impl.BasketBOImpl;
import com.tech55.assignment.businessObject.impl.CheckoutBOImpl;
import com.tech55.assignment.businessObject.impl.PromotionBOImpl;
import com.tech55.assignment.repository.BasketLineItemBORepo;
import com.tech55.assignment.repository.OfferHandlerBORepo;
import com.tech55.assignment.repository.PromotionBORepository;


@RestController
public class CheckoutController {
	
	@Autowired
	private OfferHandlerBORepo offerHandlerBORepo;
	
	@Autowired
	private BasketLineItemBORepo basketLineItemBORepo;
	
	@Autowired
	private PromotionBORepository promoBORepo;
	
	
	@GetMapping("/checkout/basket/{basketid}")
    public String getCheckout(@PathVariable int basketid) {
		
		CheckoutBO checkoutBO = getCheckoutObject(basketid);
		int price = checkoutBO.total();
		return new String("total amount : "+price);
	}
	
	@GetMapping("/checkout/basket/{basketid}/promo/{promoCode}")
    public String getCheckout(@PathVariable int basketid, @PathVariable int promoCode) {
				
		CheckoutBO checkoutBO = getCheckoutObject(basketid);
		
		if(promoCode != 0) {
			PromotionBOImpl promoBO = promoBORepo.getPromotionBO(promoCode);
			if(promoBO != null) {
				checkoutBO.applyPromo(promoBO);
			}
		}
		
		int price = checkoutBO.total();
		return new String("total amount : "+price);
    }
	
	private CheckoutBO getCheckoutObject(int basketid) {
		
		BasketBOImpl basketBOImpl= basketLineItemBORepo.getBasketBOImpl(basketid);
		
		OfferHandlerBO offerHandlerBO = offerHandlerBORepo.getOfferHandlerBO();
		
		CheckoutBO checkoutBO = new CheckoutBOImpl(offerHandlerBO);
		checkoutBO.scan(basketBOImpl);
		
		return checkoutBO;
	}
	
}
