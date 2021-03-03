package com.jodev.spring.springmvc.components;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jodev.spring.springmvc.config.LogNdc;

@Controller
@RequestMapping("/methods")
public class Controller03 {
	
	@RequestMapping(
		value = "/get", 
		method=RequestMethod.GET, 
		produces=MediaType.TEXT_PLAIN_VALUE,
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
	
	@PutMapping(
		value = "/put",
		consumes = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public String put(@RequestBody String body) {
	LogNdc.log();
	ResponseDescriptor rd = 
		ResponseDescriptor.builder()
		.withAcceptedMethod("PUT")
		.withTestDescription("Method for testing the @PutMapping")
		.withConsumes( MediaType.APPLICATION_JSON_VALUE)
		.withUrl("methods/put")
		.withRequestBody(body)
		.build();
		return rd.toString();
	}


	public Controller03() {
		super();
		LogNdc.log();
		// TODO Auto-generated constructor stub
	}
	
	
}

