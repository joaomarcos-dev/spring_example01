package com.jodev.springcore.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("qualifier01")
public class ClassImpl02 implements Interface01{

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		return array;
	}		

}
