package com.jodev.springcore.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Class04Xml{
	private ClassDependency04Xml cd04;

	public Class04Xml() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class04Xml(ClassDependency04Xml cd04) {
		super();
		this.cd04 = cd04;
	}

	public ClassDependency04Xml getCd04() {
		return cd04;
	}

	public void setCd04(ClassDependency04Xml cd04) {
		this.cd04 = cd04;
	}
	
	public void doSomething() {
		Logger log = LoggerFactory.getLogger(this.getClass());
		System.out.println("Class04Xml doing something");
	}
}
