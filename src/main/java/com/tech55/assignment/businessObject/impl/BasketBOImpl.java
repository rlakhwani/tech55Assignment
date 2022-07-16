package com.tech55.assignment.businessObject.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import com.tech55.assignment.basket.Product;
import com.tech55.assignment.businessObject.BasketBO;

public class BasketBOImpl implements BasketBO{

	Map<Product, Integer> items;    

    public BasketBOImpl() {
        items = new LinkedHashMap<>();
    }

    @Override
    public Map<Product, Integer> getItems() {
        return items;
    }

    @Override
    public void addProduct(Product product){
    	addProduct(product, 1);
    }
    
    @Override
    public void addProduct(Product product, int quantity){
        if(items.containsKey(product)){
            items.compute(product, (p,q ) -> Integer.valueOf(q+quantity));
        }else{
            items.put(product, quantity);
        }
    }

    @Override
    public void removeProduct(Product product){
    	removeProduct(product,1);
    }
    
    @Override
    public void removeProduct(Product product, int quantity){
        if(items.get(product).intValue() > quantity){
            items.compute(product, (p, q) -> Integer.valueOf(q-quantity));
        }else{
            items.remove(product);
        }
    }

}
