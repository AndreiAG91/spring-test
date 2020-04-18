package com.ag.testtask.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class RenewableRandomNumberService {
	
	@Lookup
	public NumberService getNumberService() {
		return null;
	}
	
	public int getRandomNumber() {
		return getNumberService().getValue();
	}
}
