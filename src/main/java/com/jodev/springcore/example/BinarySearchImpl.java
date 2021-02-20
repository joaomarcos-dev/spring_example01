package com.jodev.springcore.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Make this class a spring managed bean, that are registered in the ApplicationContext
public class BinarySearchImpl{

	//The member that will sort the array when needed	
	@Autowired // The SortAlgorithm is a dependency of BinarySearchImpl
	private SortAlgorithm sa;		
	
	public BinarySearchImpl(SortAlgorithm sa) {
		super();
		this.sa = sa;
	}

	public int binarySearch(int [] array, int  searchingNumber) {
		//sort the array
		int [] sortedArray = sa.sort(array);
		System.out.println(sa);
		
		//search for number
		
		//return the result
		return 45;
	}
}
