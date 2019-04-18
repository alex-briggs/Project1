package com.revature.dao;

import java.util.List;

import com.revature.model.DeniedRequests;

public interface DeniedRequestDao {

	List<DeniedRequests> getAllDeniedRequests();
	DeniedRequests getRequestById(int deniedRequestId);
	DeniedRequests createDeniedRequest(DeniedRequests DeniedRequest);
	DeniedRequests updateDeniedRequest(DeniedRequests toBeUpdated);
	
	//returns number of rows affected
	long deleteDeniedRequest(DeniedRequests... toBeDeleted);
}
