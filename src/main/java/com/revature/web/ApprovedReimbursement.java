package com.revature.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.ApprovedRequestService;
import com.revature.service.ApprovedRequestServiceImplementation;

public class ApprovedReimbursement {

private static final ApprovedRequestService approvedRequestService = new ApprovedRequestServiceImplementation();

	
	//Restrict instantiation
	private ApprovedReimbursement () {};
	
	public static Object process(HttpServletRequest request, HttpServletResponse response) {
		return approvedRequestService.getAllApprovedRequests(request, response);
	}
	
	public static Object processPost(HttpServletRequest request, HttpServletResponse response) {
		
		return approvedRequestService.createApprovedRequest(request, response);
	}
}
