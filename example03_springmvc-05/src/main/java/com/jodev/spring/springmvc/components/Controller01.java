package com.jodev.spring.springmvc.components;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jodev.spring.springmvc.config.Form01;
import com.jodev.spring.springmvc.config.LogNdc;

@Controller
@RequestMapping(path="/methods", 
	consumes=MediaType.APPLICATION_JSON_VALUE)
public class Controller01 {
	
	List<String> dbMessageTable = new ArrayList<String>();
	
	@RequestMapping(
		value = "/get", 
		method=RequestMethod.GET, 
		produces=MediaType.ALL_VALUE,
		params= {"theMustParam"})
	@ResponseBody
	public String get() {
		LogNdc.log();
		
		ResponseDescriptor rd = ResponseDescriptor.builder()
				.withAcceptedMethod("GET")
				.withTestDescription("Method for testing the @Request mapping annotation and its severakl configurations")
				.withNecessaryParam("theMustParam")
				.withProduces(MediaType.APPLICATION_JSON_VALUE)
				.withUrl("methods/get")
				.build();
		
		return rd.toString();
	}
	
	@PutMapping("/put")
	@ResponseBody
	//Could use @RestController as a class level annotation
	//Need to add Jackson to data-bind and core to the classpath
	public List put(@RequestBody String body) {
		LogNdc.log();

		/* Some kind of Data Validation*/
		
		/*Insert in DB*/
		dbMessageTable.add(body);
		
		/*Returning updated table*/
		return dbMessageTable;
	}

	@PostMapping(path="/post")
	@ResponseBody
	public Form01 post(@RequestBody Form01 body) {
		LogNdc.log();
		return body;
	}
	
	public Controller01() {
		super();
		LogNdc.log();
	}	
}

