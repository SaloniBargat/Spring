package com.springboot.AOP.Dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class Dao2 {
	public String retrieveSomething() {
		return "Dao2";
	}
}
