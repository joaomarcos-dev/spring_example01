package com.jodev.spring.springmvc.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//In this class we will configure the all the application context and configuration classes
public class AbstractDispatcherServletInitializerExt extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		LogNdc.log();
		
		// First instantiating the context by hand
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();

		//Register the @configuration class that substitutes XML and configures the IOC
		root.register(WebConfig.class);
		
//		for the automatically created DispatcherServlet local IOC
		return root;
	}

	@Override
	protected String[] getServletMappings() {
		//The mapping for the automatically created DispatcherServlet
		return new String [] {"/"};//should not use *
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		LogNdc.log();
		
//		// First instantiating the context by hand
//		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
//
//		//Register the @configuration class that substitutes XML and configures the IOC
//		root.register(WebConfig.class);
		return null;
	}
}