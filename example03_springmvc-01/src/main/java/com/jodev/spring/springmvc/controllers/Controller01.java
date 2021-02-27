package com.jodev.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller01 {
	@ResponseBody //write the method return directly on the html response
	@RequestMapping("/reports")
	public String getReport() {
		return "those are all the reports"; 
	}
	
	@ResponseBody //write the method return directly on the html response
	@RequestMapping("/kpis")
	public String getKpi() {
		return "those are all the KPI's"; 
	}
}

