package com.revature.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReimbursementRequestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private static final ObjectMapper mapper = new ObjectMapper();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.getOutputStream().write(mapper.writeValueAsBytes(ReimbursementRequest.process(request, response)));
		System.out.println("Response sent successfully");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside reimbursementrequestServlet");
		response.setContentType("application/json");
		response.getOutputStream().write(mapper.writeValueAsBytes(ReimbursementRequest.processPost(request, response)));
		System.out.println("Post Response sent successfully");
	}

}
