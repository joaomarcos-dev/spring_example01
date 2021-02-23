package com.jodev.springcore.outcomponentscan;

import org.springframework.stereotype.Component;

@Component
public class ClassOutOfComponentScan {
	public void doSomething() {
		System.out.println("ClassOutOfComponentScan doing something");
	}
}
