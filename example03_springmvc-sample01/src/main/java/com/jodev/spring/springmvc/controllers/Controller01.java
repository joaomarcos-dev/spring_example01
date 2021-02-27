package com.jodev.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jodev.spring.springmvc.config.LogNdc;

@Controller
//@RequestMapping("/registration")
public class Controller01 {
	
	//relative to the DispatcherServlet path
	@RequestMapping("/reg")
//	@ResponseBody
	public String getReport() {
		LogNdc.log();
		return "home";
	}

	public Controller01() {
		super();
		LogNdc.log();
		// TODO Auto-generated constructor stub
	}
	
	
}

