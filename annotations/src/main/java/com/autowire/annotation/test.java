package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	private static ApplicationContext context;
	
	public static void main(String[] args) 
	   {
	     ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/annotation/beans.xml");
	     Emp emp1 = context.getBean("emp1",Emp.class);
	     System.out.println(emp1);
	   
	   }
	}


