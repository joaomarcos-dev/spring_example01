package com.jodev.springcore.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Make this class a spring managed bean, that are registered in the ApplicationContext
public class Class02{

	//The member that will sort the array when needed	
	@Autowired // The SortAlgorithm is a dependency of BinarySearchImpl
	@Qualifier("qualifier01")//wiring by qualifier
	private Interface01 sortAlgorithm;
	
	public Class02(Interface01 sa) {
		super();
		this.sortAlgorithm = sa;
	}

	public int binarySearch(int [] array, int  searchingNumber) {
		
		//sort the array
		int [] sortedArray = sortAlgorithm.sort(array);
		System.out.println("Class with Qualifier");
		System.out.println(sortAlgorithm);
		
		//search for number
		
		//return the result
		return 45;
	}
}
