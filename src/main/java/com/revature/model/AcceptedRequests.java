package com.revature.model;

public class AcceptedRequests {

	private int approvedRequestId;
	private int employeeId;
	private int reimbursementAmount;
	private int managerId;
	
	public AcceptedRequests() {
		
	}

	public AcceptedRequests(int approvedRequestId, int employeeId, int reimbursementAmount, int managerId) {
		super();
		this.approvedRequestId = approvedRequestId;
		this.employeeId = employeeId;
		this.reimbursementAmount = reimbursementAmount;
		this.managerId = managerId;
	}

	public int getApprovedRequestId() {
		return approvedRequestId;
	}

	public void setApprovedRequestId(int approvedRequestId) {
		this.approvedRequestId = approvedRequestId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getReimbursementAmount() {
		return reimbursementAmount;
	}

	public void setReimbursementAmount(int reimbursementAmount) {
		this.reimbursementAmount = reimbursementAmount;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + approvedRequestId;
		result = prime * result + employeeId;
		result = prime * result + managerId;
		result = prime * result + reimbursementAmount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcceptedRequests other = (AcceptedRequests) obj;
		if (approvedRequestId != other.approvedRequestId)
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (managerId != other.managerId)
			return false;
		if (reimbursementAmount != other.reimbursementAmount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AcceptedRequests [approvedRequestId=" + approvedRequestId + ", employeeId=" + employeeId
				+ ", reimbursementAmount=" + reimbursementAmount + ", managerId=" + managerId + "]";
	}
	
	
}
