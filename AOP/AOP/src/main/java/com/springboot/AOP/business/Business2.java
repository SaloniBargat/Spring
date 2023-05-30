package com.springboot.AOP.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.AOP.Dao.Dao2;

public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.retrieveSomething();
	}

}
