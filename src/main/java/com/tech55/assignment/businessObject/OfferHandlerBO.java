package com.tech55.assignment.businessObject;

import java.util.Map;

import com.tech55.assignment.basket.Offer;

public interface OfferHandlerBO {

    public Map<Integer, Offer> getOffers();
    
    public Offer getOffer(int productSku);

    public void addOffer(Offer offer);

    public void removeOffer(Offer offer);

}
