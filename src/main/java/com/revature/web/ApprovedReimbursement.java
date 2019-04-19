package com.revature.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.PendingRequestService;
import com.revature.service.PendingRequestServiceImplementation;

public class ApprovedReimbursement {

private static final PendingRequestService pendingRequestService = new PendingRequestServiceImplementation();

	
	//Restrict instantiation
	private ApprovedReimbursement () {};
	
	public static Object process(HttpServletRequest request, HttpServletResponse response) {
		return pendingRequestService.updatePendingRequest(request, response);
	}
	
	public static Object processPost(HttpServletRequest request, HttpServletResponse response) {
		return pendingRequestService.updatePendingRequest(request, response); 
	}
}
