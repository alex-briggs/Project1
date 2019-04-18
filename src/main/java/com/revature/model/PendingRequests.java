package com.revature.model;

public class PendingRequests {

	private int requestId;
	private int employeeId;
	private int reimbursementAmount;
	private int managerId;
	
	public PendingRequests() {
		
	}

	public PendingRequests(int requestId, int employeeId, int reimbursementAmount, int managerId) {
		super();
		this.requestId = requestId;
		this.employeeId = employeeId;
		this.reimbursementAmount = reimbursementAmount;
		this.managerId = managerId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
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
		result = prime * result + employeeId;
		result = prime * result + managerId;
		result = prime * result + reimbursementAmount;
		result = prime * result + requestId;
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
		PendingRequests other = (PendingRequests) obj;
		if (employeeId != other.employeeId)
			return false;
		if (managerId != other.managerId)
			return false;
		if (reimbursementAmount != other.reimbursementAmount)
			return false;
		if (requestId != other.requestId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PendingRequests [requestId=" + requestId + ", employeeId=" + employeeId + ", reimbursementAmount="
				+ reimbursementAmount + ", managerId=" + managerId + "]";
	}
	
	
}
