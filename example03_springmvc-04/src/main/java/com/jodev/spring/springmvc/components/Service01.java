package com.jodev.spring.springmvc.components;

import org.springframework.stereotype.Service;

@Service
public class Service01 {
	
	public String getInfo() {
		return "Returned information from Service01";
	}
}
