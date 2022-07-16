package com.tech55.assignment.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech55.assignment.basket.Offer;
import com.tech55.assignment.businessObject.OfferHandlerBO;
import com.tech55.assignment.businessObject.impl.OfferHandlerBOImpl;
import com.tech55.assignment.repository.OfferHandlerBORepo;
import com.tech55.assignment.repository.OfferRepository;

@Repository
public class OfferHandlerBORepoImpl implements OfferHandlerBORepo {

	@Autowired
	private OfferRepository offerRepo;
	
	@Override
	public OfferHandlerBO getOfferHandlerBO() {
		List<Offer> offerList = offerRepo.findAll();
		OfferHandlerBO offerHandlerBO = new OfferHandlerBOImpl();
		for(Offer offer : offerList) {
			offerHandlerBO.addOffer(offer);
		}
		return offerHandlerBO;
	}
	
}
