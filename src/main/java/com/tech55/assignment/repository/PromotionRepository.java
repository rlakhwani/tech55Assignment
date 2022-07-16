package com.tech55.assignment.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tech55.assignment.basket.Promotion;

import java.lang.String;


public interface PromotionRepository extends JpaRepository<Promotion, Long>{
	Promotion findByPromoCode(String promocode);
	Promotion findByPromoId(int promoId);
}
