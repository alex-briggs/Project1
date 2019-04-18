package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.service.PendingRequestService;
import com.revature.service.PendingRequestServiceImplementation;

public class ReimbursementRequestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private static final ObjectMapper mapper = new ObjectMapper();
	private final PendingRequestService requestService = new PendingRequestServiceImplementation();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String requestId = request.getParameter("requestId");
		final String employeeId = request.getParameter("employeeId");
		final String  requestAmount = request.getParameter("reimbursementAmount");
		
		System.out.println("inside reimbursementrequestServlet");
		response.setContentType("application/json");
		response.getOutputStream().write(mapper.writeValueAsBytes(ReimbursementRequest.processPost(request, response)));
		System.out.println("Post Response sent successfully");
	}

}
