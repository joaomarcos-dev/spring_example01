package com.jodev.springcore.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Example01Application {

	public static void main(String[] args) {
		
		BinarySearchImpl bs = new BinarySearchImpl();
		int result = bs.binarySearch(new int []  {5,48,96,2,100,25,6}, 8);
		
		System.out.println(result);
		SpringApplication.run(Example01Application.class, args);
	}

}
