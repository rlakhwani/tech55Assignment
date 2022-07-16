package com.tech55.assignment.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech55.assignment.basket.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>
{
	//creating query method
	List<Offer> findByProductSku(int sku);
}

