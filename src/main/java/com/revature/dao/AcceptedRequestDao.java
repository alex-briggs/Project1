package com.revature.dao;

import java.util.List;

import com.revature.model.AcceptedRequests;

public interface AcceptedRequestDao {
	List<AcceptedRequests> getAllAcceptedRequests();
	AcceptedRequests getRequestById(int approvedRequestId);
	AcceptedRequests createAcceptedRequest(AcceptedRequests AcceptedRequest);
	AcceptedRequests updateAcceptedRequest(AcceptedRequests toBeUpdated);
	
	//returns number of rows affected
	long deleteAcceptedRequest(AcceptedRequests... toBeDeleted);
}
