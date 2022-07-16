package com.tech55.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tech55.assignment.basket.PromotionType;
import com.tech55.assignment.repository.PromoTypeRepository;

@RestController
public class PriceTypeController {

	@Autowired
	private PromoTypeRepository repo;
	
	
	@GetMapping("/promotionType")
    public List<PromotionType> listAll() {
        return repo.findAll();
    }
	
	@GetMapping("/promotionType/{id}")
    public Optional<PromotionType> getProduct(@PathVariable long id ) {
        return repo.findById(id);
    }
}
