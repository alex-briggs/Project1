package com.revature.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.AcceptedRequestDao;
import com.revature.dao.AcceptedRequestDaoImplementation;
import com.revature.model.AcceptedRequests;

public class ApprovedRequestServiceImplementation implements ApprovedRequestService {

	private final AcceptedRequestDao acceptedRequestDao = new AcceptedRequestDaoImplementation();
	private final ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public List<AcceptedRequests> getAllApprovedRequests(HttpServletRequest request, HttpServletResponse response) {
		return acceptedRequestDao.getAllAcceptedRequests();
	}

	@Override
	public AcceptedRequests createApprovedRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			AcceptedRequests acceptedRequest = mapper.readValue(request.getInputStream(), AcceptedRequests.class);
			return acceptedRequestDao.createAcceptedRequest(acceptedRequest);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public AcceptedRequests updateApprovedRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			AcceptedRequests acceptedRequest = mapper.readValue(request.getInputStream(), AcceptedRequests.class);
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
