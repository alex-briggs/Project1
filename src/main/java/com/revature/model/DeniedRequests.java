package com.revature.model;

public class DeniedRequests {
	private int deniedRequestId;
	private int employeeId;
	private int reimbursementAmount;
	private int managerId;

	public DeniedRequests() {
		
	}

	public DeniedRequests(int deniedRequestId, int employeeId, int reimbursementAmount, int managerId) {
		super();
		this.deniedRequestId = deniedRequestId;
		this.employeeId = employeeId;
		this.reimbursementAmount = reimbursementAmount;
		this.managerId = managerId;
	}

	public int getDeniedRequestId() {
		return deniedRequestId;
	}

	public void setDeniedRequestId(int deniedRequestId) {
		this.deniedRequestId = deniedRequestId;
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
		result = prime * result + deniedRequestId;
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
		DeniedRequests other = (DeniedRequests) obj;
		if (deniedRequestId != other.deniedRequestId)
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
		return "DeniedRequests [deniedRequestId=" + deniedRequestId + ", employeeId=" + employeeId
				+ ", reimbursementAmount=" + reimbursementAmount + ", managerId=" + managerId + "]";
	}
	
	
}
