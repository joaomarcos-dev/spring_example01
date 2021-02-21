package com.jodev.springcore.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Make this class a spring managed bean, that are registered in the ApplicationContext
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Class04{
	@Autowired
	private ClassDependency04 cd04;
	
	@Autowired
	private ClassDependency04_b cd04_b;
	
	public ClassDependency04_b getCd04_b() {
		return cd04_b;
	}

	public Class04(ClassDependency04 cd04) {
		super();
		this.cd04 = cd04;
	}

	public ClassDependency04 getCd04() {
		return cd04;
	}
	
}
