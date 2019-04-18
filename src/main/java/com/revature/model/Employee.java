package com.revature.model;

public class Employee {
	private int employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeUserName;
	private String employeePassword;
	private int departmentNumber;
	private int managerId;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String employeeFirstName, String employeeLastName, String employeeUserName,
			String employeePassword, int departmentNumber, int managerId) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeUserName = employeeUserName;
		this.employeePassword = employeePassword;
		this.departmentNumber = departmentNumber;
		this.managerId = managerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeUserName() {
		return employeeUserName;
	}

	public void setEmployeeUserName(String employeeUserName) {
		this.employeeUserName = employeeUserName;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
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
		result = prime * result + departmentNumber;
		result = prime * result + ((employeeFirstName == null) ? 0 : employeeFirstName.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((employeeLastName == null) ? 0 : employeeLastName.hashCode());
		result = prime * result + ((employeePassword == null) ? 0 : employeePassword.hashCode());
		result = prime * result + ((employeeUserName == null) ? 0 : employeeUserName.hashCode());
		result = prime * result + managerId;
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
		Employee other = (Employee) obj;
		if (departmentNumber != other.departmentNumber)
			return false;
		if (employeeFirstName == null) {
			if (other.employeeFirstName != null)
				return false;
		} else if (!employeeFirstName.equals(other.employeeFirstName))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeLastName == null) {
			if (other.employeeLastName != null)
				return false;
		} else if (!employeeLastName.equals(other.employeeLastName))
			return false;
		if (employeePassword == null) {
			if (other.employeePassword != null)
				return false;
		} else if (!employeePassword.equals(other.employeePassword))
			return false;
		if (employeeUserName == null) {
			if (other.employeeUserName != null)
				return false;
		} else if (!employeeUserName.equals(other.employeeUserName))
			return false;
		if (managerId != other.managerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", employeeUserName=" + employeeUserName + ", employeePassword=" + employeePassword
				+ ", departmentNumber=" + departmentNumber + ", managerId=" + managerId + "]";
	}
	
	
}

