package com.jodev.springcore.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Class06 {

	@Value("From the arguments annotation")
	String dbUrl;
	
	@Value("${valuename}")
	String dbFileUrl;

	public String getDbUrl() {
		return dbUrl;
	}
	
	public String getDbFileUrl() {
		return this.dbFileUrl;
	}
}
