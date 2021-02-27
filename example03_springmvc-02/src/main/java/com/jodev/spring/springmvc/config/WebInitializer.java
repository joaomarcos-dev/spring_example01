package com.jodev.spring.springmvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.jodev.spring.springmvc.controllers.Controller01;

//In this class we will configure the all the application context and configuration classes
public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		LogNdc.log();
		

		// First instantiating the context by hand
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();

		//Register the @configuration class that substitutes XML and configures the IOC
		root.register(WebConfig.class);
		
		//Refresh the changes in the IOC at runtime
		root.refresh();
		
		//The root IOC will be in the original ServletContext provided by the container
		root.setServletContext(sc);
		
		//Registering the Spring ContextLoaderListener with the created root IOC
		sc.addListener(new ContextLoaderListener(root));

		// adds the DispatcherServlet dynamically to the context
		//Each DispatcherServlet may have its own IOC separated from the root
		// Register the Dispatcher Servlet to the ServletContext(one per web application per JVM)
		DispatcherServlet dv = new DispatcherServlet(root);
		ServletRegistration.Dynamic appServlet = sc.addServlet("test", dv);
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/test/*");
	}
}