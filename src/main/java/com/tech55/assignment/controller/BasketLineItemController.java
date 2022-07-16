package com.tech55.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.tech55.assignment.basket.BasketLineItem;
import com.tech55.assignment.repository.BasketLineItemRepository;

@RestController
public class BasketLineItemController {
	
	
	@Autowired
	private BasketLineItemRepository repo;
	
	
	@GetMapping("/baskets")
    public List<BasketLineItem> listAll() {
        return repo.findAll();
    }
	
	@GetMapping("/baskets/{basketid}")
    public List<BasketLineItem> getBasketLineItems(@PathVariable int basketid) {
        return repo.findByBasketid(basketid);
    }
}
