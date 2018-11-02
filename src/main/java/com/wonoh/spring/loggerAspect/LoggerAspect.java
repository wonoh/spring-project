package com.wonoh.spring.loggerAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);
    
	@Before("execution(* com.wonoh.spring.controller.HomeController.*.*(..))")
	public void testLog() {
		logger.info("---------------------------");
		logger.info("controller 실행전");
		logger.info("---------------------------");
	}
}
