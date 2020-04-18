package com.ag.testtask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NonRenewableRandomNumberService {
	
	@Autowired
	private NumberService numberService;
	
	public int getRandomNumber() {
		return numberService.getValue();
	}
}
