package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.revature.model.PendingRequests;
import com.revature.util.ConnectionFactory;

public class PendingRequestDaoImplementation implements PendingRequestDao{

	@Override
	public List<PendingRequests> getAllPendingRequests() {
		List<PendingRequests> pendingRequests = new ArrayList<>();
		//Get our connection 
		try (Connection conn = ConnectionFactory.getConnection()){
			//create statement to communicate with database
			Statement stmt = conn.createStatement();
			//execute statement, all matched records can be found in the ResultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM pendingrequest");
			//populate list of pendingRequests from the ResultSet
			while (rs.next()) {
				pendingRequests.add(new PendingRequests(rs.getInt("request_id"), rs.getInt("reimbursement_amount"), rs.getInt("manager_id"), rs.getInt("emp_id"), rs.getString("status")));
			}
			//Return pendingRequests so that the application can further manipulate
			return pendingRequests;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public PendingRequests getRequestById(int requestId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PendingRequests createPendingRequest(PendingRequests pendingRequest) {
		//get connection to data source
				try (Connection conn = ConnectionFactory.getConnection()){
					System.out.println("inside pendingrequestDAO");
					//preparedStatement to avoid sql injections
					//initialize our insert statement
					PreparedStatement stmt = conn.prepareStatement("INSERT INTO pendingrequest(request_id, reimbursement_amount, manager_id, emp_id, status) VALUES (?,?,?,?,?)");
					//set the values of the insert statement to help prevent SQL injection
					System.out.println("created prepared statement");
					stmt.setInt(1, pendingRequest.getRequestId());
					stmt.setInt(2, pendingRequest.getReimbursementAmount());
					System.out.println(pendingRequest.getReimbursementAmount());
					stmt.setInt(3, 1);
					stmt.setInt(4, pendingRequest.getEmployeeId());
					stmt.setString(5,  "pending");
					
					//execute the query, determining the number of rows that were affected
					int rowsAffected = stmt.executeUpdate();
					
					if(rowsAffected == 1) {
						System.out.println(pendingRequest);
						return pendingRequest;
					}
					
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				return new PendingRequests();

	}

	@Override
	public PendingRequests updatePendingRequest(PendingRequests toBeUpdated) {
		try (Connection conn = ConnectionFactory.getConnection()){
			System.out.println("inside pendingrequestDAO");
			//preparedStatement to avoid sql injections
			//initialize our insert statement
			PreparedStatement stmt = conn.prepareStatement("UPDATE pendingrequests SET status = ? WHERE request_id = ?");
			//set the values of the insert statement to help prevent SQL injection
			System.out.println("created prepared statement");
			stmt.setString(1, toBeUpdated.getStatus());
			stmt.setInt(2, toBeUpdated.getRequestId());
	
			
			
			//execute the query, determining the number of rows that were affected
			int rowsAffected = stmt.executeUpdate();
			
			if(rowsAffected == 1) {
				System.out.println(toBeUpdated);
				return toBeUpdated;
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return new PendingRequests();
	}

	@Override
	public long deletePendingRequest(PendingRequests... toBeDeleted) {
		// TODO Auto-generated method stub
		return 0;
	}

}
