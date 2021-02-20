package com.jodev.springcore.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Make this class a spring managed bean, that are registered in the ApplicationContext
public class Class01{

	//The member that will sort the array when needed	
	@Autowired // The SortAlgorithm is a dependency of BinarySearchImpl
	private Interface01 bubbleSortAlgorithm;//Autowiring by type and name, using the same name of the implementation in camelCame format 	
	
	public Class01(Interface01 sa) {
		super();
		this.bubbleSortAlgorithm = sa;
	}

	public int binarySearch(int [] array, int  searchingNumber) {
		//sort the array
		int [] sortedArray = bubbleSortAlgorithm.sort(array);
		System.out.println(bubbleSortAlgorithm);
		
		//search for number
		
		//return the result
		return 45;
	}
}
