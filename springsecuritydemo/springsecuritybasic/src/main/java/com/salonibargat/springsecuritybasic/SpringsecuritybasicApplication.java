package com.salonibargat.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.dipikaswargwani.springsecuritybasic.controller") //this annotation is optional but if our controller is in different package then we use the ComponentScan
public class SpringsecuritybasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritybasicApplication.class, args);
	}

}
