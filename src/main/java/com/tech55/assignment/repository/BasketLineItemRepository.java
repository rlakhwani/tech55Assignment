package com.tech55.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech55.assignment.basket.BasketLineItem;


public interface BasketLineItemRepository extends JpaRepository<BasketLineItem, Long>{
	List<BasketLineItem> findByBasketid(int basketid);
}
