package com.tech55.assignment.repository;

import com.tech55.assignment.businessObject.impl.PromotionBOImpl;

public interface PromotionBORepository {
	public PromotionBOImpl getPromotionBO(int promocode);
}
