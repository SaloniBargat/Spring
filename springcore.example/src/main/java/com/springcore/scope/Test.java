package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
   public static void main(String[] args) 
   {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/scope/beans.xml");
     Manager t1 = context.getBean("manager",Manager.class);
     Manager t2 = context.getBean("manager",Manager.class);
     
     System.out.println(t1.hashCode());
     System.out.println(t2.hashCode());
   }
}
