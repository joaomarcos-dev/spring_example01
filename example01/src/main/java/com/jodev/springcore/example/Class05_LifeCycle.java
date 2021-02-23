package com.jodev.springcore.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component //Make this class a spring managed bean, that are registered in the ApplicationContext
public class Class05_LifeCycle{
	Logger logger;
	
	public Class05_LifeCycle(ClassDependency04 cd04) {
		super();
		logger = LoggerFactory.getLogger(this.getClass());
	}
	
	@PostConstruct
	public void postContruct() {
		logger.info("Class05_LifeCycle post contruct");
	}

	public void doSomething() {
		logger.info("Class05_LifeCycle doing something");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("Class05_LifeCycle preDestroy");
	}
	
}
