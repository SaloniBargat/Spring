package com.springboot.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UseAccessAspect {
	
	private Logger logger= LoggerFactory.getLogger(this.getClass());

	
	@AfterReturning(value="execution(*com.springboot.AOP.business.*.*(..))",
			returning="result"
			)
	public void after(JoinPoint joinPoint,Object result) {
		logger.info("Check for user Access");
		logger.info("{} returned with value {}", joinPoint,result);
		
	}
	@After(value="execution(*com.springboot.AOP.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of{}",joinPoint);
	}

   @Around("execution(*com.springboot.AOP.business.*.*(..))")
		   public void around(ProceedingJoinPoint joinPoint) throws Throwable {
	   		long startTime = System.currentTimeMillis();
	   		joinPoint.proceed();
	   		long timeTaken = System.currentTimeMillis()-startTime;
	   		logger.info("Time taken by {} is {}", joinPoint, timeTaken);
   }
			   
}	