package com.springboot.AOP.Dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class Dao1 {
	public String retrieveSomething() {
		return "Dao1";
	}
}
