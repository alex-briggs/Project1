package com.revature.model;

public class PendingRequests {

	private int requestId;
	private int employeeId;
	private int reimbursementAmount;
	private int managerId;
	private String status;
	
	public PendingRequests() {
		
	}

	public PendingRequests(int requestId, int employeeId, int reimbursementAmount, int managerId, String status) {
		super();
		this.requestId = requestId;
		this.employeeId = employeeId;
		this.reimbursementAmount = reimbursementAmount;
		this.managerId = managerId;
		this.status = status;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PendingRequests [requestId=" + requestId + ", employeeId=" + employeeId + ", reimbursementAmount="
				+ reimbursementAmount + ", managerId=" + managerId + ", status=" + status + "]";
	}

	
	
	
}
