package com.jodev.springcore.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Make this class a spring managed bean, that are registered in the ApplicationContext
@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Class03{

	//The member that will sort the array when needed	
	@Autowired // The SortAlgorithm is a dependency of BinarySearchImpl
	private Interface01 sortAlgorithm;
	
	public Class03(Interface01 sa) {
		super();
		this.sortAlgorithm = sa;
	}

	public int binarySearch(int [] array, int  searchingNumber) {
		System.out.println("Class with NOT Singleton");
		System.out.println(sortAlgorithm);
		
		//return the result
		return 45;
	}
}
