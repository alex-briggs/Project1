window.onload = () => {
	getAllEmployees();
}

const getAllEmployees = () => {
	const xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = () => {
		if (xhr.status === 200 && xhr.readyState === 4) {
			const json = xhr.responseText;
			populateTable(JSON.parse(json));
			console.log(json);
		}
	}
	
	xhr.open("GET", "http://localhost:8088/ERSProject/api/employees");
	
	xhr.send();
}

const populateTable = (listOfEmployees) => {
	
	for (let employee of listOfEmployees) {
		const tdEmployeeId = document.createElement("td");
		const tdEmpFirstName = document.createElement("td");
		const tdEmpLastName = document.createElement("td");

		// Set the value of each cell
		tdEmployeeId.textContent = employee.employeeId;
		tdEmpFirstName.textContent = employee.employeeFirstName;
		tdEmpLastName.textContent = employee.employeeLastName;
		
		// Create a row to be appended onto our table
		const row = document.createElement("tr");
		
		// Set the td's to the corresponding order of our table header
		row.appendChild(tdEmployeeId);
		row.appendChild(tdEmpFirstName);
		row.appendChild(tdEmpLastName);
		
		
		// Append our row onto our table of todos
		document.getElementById("employeeTable").appendChild(row);
	}
}