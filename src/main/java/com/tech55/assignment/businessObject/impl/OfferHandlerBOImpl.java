package com.tech55.assignment.businessObject.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import com.tech55.assignment.basket.Offer;
import com.tech55.assignment.businessObject.OfferHandlerBO;

public class OfferHandlerBOImpl implements OfferHandlerBO{

	Map<Integer, Offer> items;    

    public OfferHandlerBOImpl() {
        items = new LinkedHashMap<>();
    }
    
    @Override
    public Map<Integer, Offer> getOffers() {
        return items;
    }
    
    @Override
    public Offer getOffer(int productSku) {
    	Offer offer = null;
    	if(items.containsKey(productSku)) {
    		offer = items.get(productSku);
    	}
    	return offer;
    }

    @Override
    public void addOffer(Offer offer){
        if(items.containsKey(offer.getProductSku())){
        	items.put(offer.getProductSku(), offer);
        }else{
            items.put(offer.getProductSku(), offer);
        }
    }

    @Override
    public void removeOffer(Offer offer){
        if(items.containsKey(offer.getProductSku())){
        	items.remove(offer.getProductSku());
        }
    }

}
