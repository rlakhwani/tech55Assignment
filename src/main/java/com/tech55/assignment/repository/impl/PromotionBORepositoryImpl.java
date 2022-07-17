package com.tech55.assignment.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech55.assignment.basket.Promotion;
import com.tech55.assignment.basket.PromotionType;
import com.tech55.assignment.businessObject.impl.PromotionBOImpl;
import com.tech55.assignment.repository.PromoTypeRepository;
import com.tech55.assignment.repository.PromotionBORepository;
import com.tech55.assignment.repository.PromotionRepository;

@Repository
public class PromotionBORepositoryImpl implements PromotionBORepository{
	@Autowired
	private PromoTypeRepository promoTypeRepo;
	
	@Autowired 
	private PromotionRepository promotionRepo;
	
	public PromotionBOImpl getPromotionBO(int promocode){
		Promotion promotion = promotionRepo.findByPromoId(promocode);
		PromotionBOImpl promotionBOImpl = null;
		if(promotion != null) {
			PromotionType promoType= promoTypeRepo.findByPromoTypeId(promotion.getPromoTypeId());
			promotionBOImpl = new PromotionBOImpl(promotion.getPromoCode(),promoType);
		}
		return promotionBOImpl;
	}
	
}
