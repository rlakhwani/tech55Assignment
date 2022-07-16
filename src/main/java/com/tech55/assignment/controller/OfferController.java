package com.tech55.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tech55.assignment.basket.Offer;
import com.tech55.assignment.repository.OfferRepository;

@RestController
public class OfferController {

	
	@Autowired
	private OfferRepository repo;
	
	
	@GetMapping("/offers")
    public List<Offer> listAll() {
        return repo.findAll();
    }
	
	@GetMapping("/offers/{sku}")
    public List<Offer> getOffer(@PathVariable int sku) {
        return repo.findByProductSku(sku);
    }
}
