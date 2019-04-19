package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.AcceptedRequests;
import com.revature.util.ConnectionFactory;

public class AcceptedRequestDaoImplementation implements AcceptedRequestDao {

	@Override
	public List<AcceptedRequests> getAllAcceptedRequests() {
		List<AcceptedRequests> approvedRequests = new ArrayList<>();
		try (Connection conn = ConnectionFactory.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM approvedrequest");
			while (rs.next()) {
				approvedRequests.add(new AcceptedRequests(rs.getInt("approved_request_id"), rs.getInt("emp_id"), rs.getInt("reimbursement_amount"), rs.getInt("manager_id")));
			}
			return approvedRequests;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public AcceptedRequests getRequestById(int approvedRequestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcceptedRequests createAcceptedRequest(AcceptedRequests acceptedRequest) {
		try (Connection conn = ConnectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO approvedrequest(approved_request_id, emp_id, reimbursement_amount, manager_id) VALUES (?,?,?,?)");
			stmt.setInt(1,  acceptedRequest.getApprovedRequestId());
			stmt.setInt(2,  acceptedRequest.getEmployeeId());
			stmt.setInt(3, acceptedRequest.getReimbursementAmount());
			stmt.setInt(4, acceptedRequest.getManagerId());
			
			int rowsAffected = stmt.executeUpdate();
			
			if(rowsAffected == 1) {
				return acceptedRequest;
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new AcceptedRequests();
	}

	@Override
	public AcceptedRequests updateAcceptedRequest(AcceptedRequests toBeUpdated) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long deleteAcceptedRequest(AcceptedRequests... toBeDeleted) {
		// TODO Auto-generated method stub
		return 0;
	}

}
