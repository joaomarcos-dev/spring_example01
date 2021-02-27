package com.jodev.spring.springmvc;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp){
		try {
			resp.getWriter().print("The response text");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}