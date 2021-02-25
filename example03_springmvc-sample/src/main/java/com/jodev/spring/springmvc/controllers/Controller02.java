package com.jodev.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/statistics")
public class Controller02 {
	@ResponseBody //write the method return directly on the html response
	@RequestMapping("/reports")
	public String getReport() {
		return "those are all the reports UNDER statistics"; 
	}
	
	@ResponseBody //write the method return directly on the html response
	@RequestMapping("/kpis")
	public String getKpi() {
		return "those are all the KPI's UNDER statistics"; 
	}
	
//	@ResponseBody //write the method return directly on the html response
	@RequestMapping("/dashboard")
	public String getDashboard() {
		return "/WEB-INF/view/View01.jsp"; 
	}
	
	@RequestMapping("/dashboardVR")
	public String getDashboardViewResolver() {
		
		return "View01"; 
	}
}

