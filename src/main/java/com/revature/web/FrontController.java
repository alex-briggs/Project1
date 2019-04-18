package com.revature.web;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.EmployeeService;
import com.revature.service.EmployeeServiceImplementation;

public class FrontController {
	
	private static final EmployeeService employeeService = new EmployeeServiceImplementation();
	
	private FrontController() {}
	
	public static Object processGet(HttpServletRequest request, HttpServletResponse response) {
		final String uri = request.getRequestURI().replace("/ERSProject/api", "");
		switch (uri) {
		case "./employees":
			return employeeService.getAllEmployees(request, response);
		case "./login":
			return employeeService.getEmployeeByUserNameAndPassword(request, response);
		default:
			return Collections.singletonMap("message", "Not yet implemented");
		}
	}
	
	
	  public static Object processPost(HttpServletRequest request, HttpServletResponse response) { 
		  final String uri = request.getRequestURI().replace("/ERSProject/api", "");
		  switch (uri) { 
		  case "/employees": 
			  return employeeService.createEmployee(request, response); 
		  default: 
			  return Collections.singletonMap("message", "Not yet implemented"); 
		  } 
	  }
	 

}
