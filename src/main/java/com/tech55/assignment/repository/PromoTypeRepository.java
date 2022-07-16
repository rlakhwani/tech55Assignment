package com.tech55.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech55.assignment.basket.PromotionType;

public interface PromoTypeRepository extends JpaRepository<PromotionType, Long>
{
	PromotionType findByPromoName(String promoName);
	PromotionType findByPromoTypeId(long promoTypeId);
}

