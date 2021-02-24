package com.jodev.springcore.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jodev.springcore.outcomponentscan.ClassOutOfComponentScan;

@Configuration
@ComponentScan //Needed for Springboot
public class  TrainingApplication{
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		//Which method to run 
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(Method m : TrainingApplication.class.getDeclaredMethods()){
				if(m.getName().equals("test"+s)) {
					System.out.println("Running: "+ m.getName());
					m.setAccessible(true);
					m.invoke(new TrainingApplication());
			}
		}
	}
	
	public void test01() {
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = new AnnotationConfigApplicationContext(TrainingApplication.class);
		Class01 bs = ac.getBean(Class01.class);
		
		//Test array
		int result = bs.binarySearch(new int []  {5,48,96,2,100,25,6}, 8);
		
		System.out.println(result);
	}
	
	public void test02() {
		
		System.out.println("Testing @Qualifier");
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = new AnnotationConfigApplicationContext(TrainingApplication.class);
		Class02 bs = ac.getBean(Class02.class);
		
		//Test array
		int result = bs.binarySearch(new int []  {5,48,96,2,100,25,6}, 8);
		
		System.out.println(result);
	}
	
	
	public void test03() {
		System.out.println("Testing @Scope");
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = new AnnotationConfigApplicationContext(TrainingApplication.class);
		
		Class02 c2_a = ac.getBean(Class02.class);
		Class02 c2_b = ac.getBean(Class02.class);
		
		System.out.println("Same instance");
		System.out.println(c2_a);
		System.out.println(c2_b);
		
		Class03 c3_a = ac.getBean(Class03.class);
		Class03 c3_b = ac.getBean(Class03.class);
		
		System.out.println("Different instances");
		System.out.println(c3_a);
		System.out.println(c3_b);		
	}
	
	public void test04() {
		System.out.println("Testing @Scope");
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = new AnnotationConfigApplicationContext(TrainingApplication.class);
		
		Class02 c2_a = ac.getBean(Class02.class);
		Class02 c2_b = ac.getBean(Class02.class);
		
		System.out.println("Same instance");
		System.out.println(c2_a);
		System.out.println(c2_b);
		
		Class03 c3_a = ac.getBean(Class03.class);
		Class03 c3_b = ac.getBean(Class03.class);
		
		System.out.println("Different instances");
		System.out.println(c3_a);
		System.out.println(c3_b);
	
	}
	
	public void test05() {
		System.out.println("Testing @Scope");
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = new AnnotationConfigApplicationContext(TrainingApplication.class);

		Class04 c4_a = ac.getBean(Class04.class);
		Class04 c4_b = ac.getBean(Class04.class);
		
		System.out.println("Same instance");
		System.out.println(c4_a);
		System.out.println(c4_b);
	
		System.out.println("This instances return the same ClassDependency04 dependecy instance");
		System.out.println(c4_a.getCd04_b());
		System.out.println(c4_b.getCd04_b());

		System.out.println("But this instances does not return the ClassDependency04 dependecy instance, due to the proxy mode");
		System.out.println(c4_a.getCd04());
		System.out.println(c4_b.getCd04());
		
	}
	
	public void test06() {
		System.out.println("Testing @ComponentScan");
		System.out.println("Should throw an error if missing @ComponentScan in the @SpringBoot application");
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = new AnnotationConfigApplicationContext(TrainingApplication.class);

		ClassOutOfComponentScan cofcs = ac.getBean(ClassOutOfComponentScan.class);
		cofcs.doSomething();
	}
	
	
	public void test07() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		
		//Getting the Beans from Spring IOC
		ApplicationContext ac = new AnnotationConfigApplicationContext(TrainingApplication.class);
		
		Class05_LifeCycle c = ac.getBean(Class05_LifeCycle.class);
		c.doSomething();
		
	}
}
