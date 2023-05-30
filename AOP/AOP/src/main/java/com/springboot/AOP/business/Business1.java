package com.springboot.AOP.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.AOP.Dao.Dao1;

public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}

}
