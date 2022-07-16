package com.tech55.assignment.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech55.assignment.basket.BasketLineItem;
import com.tech55.assignment.businessObject.impl.BasketBOImpl;
import com.tech55.assignment.repository.BasketLineItemBORepo;
import com.tech55.assignment.repository.BasketLineItemRepository;
import com.tech55.assignment.repository.ProductRepository;

@Repository
public class BasketLineItemBORepoImpl implements BasketLineItemBORepo {
    
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private BasketLineItemRepository basketRepo;
	
    public BasketBOImpl getBasketBOImpl(int basketid) {
    	List<BasketLineItem> basketLineItemList = basketRepo.findByBasketid(basketid);
    	
    	BasketBOImpl basketBOImpl = new BasketBOImpl();
    	for(BasketLineItem basketLineItem : basketLineItemList) {
    		basketBOImpl.addProduct(productRepo.findBySku(basketLineItem.getProductSku()),basketLineItem.getProductQuantity());
		}
    	return basketBOImpl;
    }
}
