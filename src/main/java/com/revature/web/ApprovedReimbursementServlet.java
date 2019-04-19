package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApprovedReimbursementServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private static final ObjectMapper mapper = new ObjectMapper();
	
	public ApprovedReimbursementServlet() {
	
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("made it to the doPost of ApprovedReimbursementServlet");
		resp.setContentType("application/json");
		resp.getOutputStream().write(mapper.writeValueAsBytes(ApprovedReimbursement.processPost(req, resp)));
	}
}
