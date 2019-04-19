package com.revature.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.AcceptedRequests;

public interface ApprovedRequestService {
	List<AcceptedRequests> getAllApprovedRequests(HttpServletRequest request, HttpServletResponse response);
	AcceptedRequests createApprovedRequest(HttpServletRequest request, HttpServletResponse response);
	AcceptedRequests updateApprovedRequest(HttpServletRequest request, HttpServletResponse response);
	
}
