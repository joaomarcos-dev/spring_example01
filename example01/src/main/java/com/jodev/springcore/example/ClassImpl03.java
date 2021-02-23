package com.jodev.springcore.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //There are two beans of this type, this is the primary
public class ClassImpl03 implements Interface01{

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		return array;
	}
	
}
