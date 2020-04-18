package com.ag.testtask.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class NumberService {
	
	public NumberService() {
		this.value = ThreadLocalRandom.current().nextInt(0, 100);
	}
	
	private int value;
	
	public int getValue() {
		return value;
	}
}
