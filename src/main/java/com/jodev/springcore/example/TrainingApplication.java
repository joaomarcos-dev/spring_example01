package com.jodev.springcore.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingApplication {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Which method to run 
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(Method m : TrainingApplication.class.getDeclaredMethods()){
				if(m.getName() == "test"+s) {
				m.setAccessible(true);
				m.invoke(null);
			}
		}
	}
	
	public void test01() {
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = SpringApplication.run(TrainingApplication.class);
		ClassImpl01 bs = ac.getBean(ClassImpl01.class);
		
		//Test array
		int result = bs.binarySearch(new int []  {5,48,96,2,100,25,6}, 8);
		
		System.out.println(result);
		SpringApplication.run(TrainingApplication.class);
	}
	
	
}
