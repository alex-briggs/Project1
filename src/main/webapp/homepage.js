window.onload = () => {
	getAllPendingRequests();
	document.getElementById("createRequestBtn").addEventListener("click", createRequest);
	document.getElementById("populateRequestTable").addEventListener("click", populatePendingRequestTable);
}

const giveMeMoney = () => {
	const x = document.getElementById("reimbursement");
	if(x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
}

const showMeMoney = () => {
	const x = document.getElementById("pendingTable");
	if(x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
}

const yayMoney = () => {
	const x = document.getElementById("approvedTable");
	if(x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
}

const noMoney = () => {
	const x = document.getElementById("deniedTable");
	if(x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
}

const getAllPendingRequests = () => {
	//Step 1: Create an XMLHttpRequest object
	const xhr = new XMLHttpRequest();
	
	//Step 2: Assign a callback function to xhr.onreadystatechange
	xhr.onreadystatechange = () => {
		//Step 5: Handle each of the different possible outcomes from making this request 
		if (xhr.status === 200 && xhr.readyState === 4){
			const json = xhr.responseText;
			populatePendingRequestTable(JSON.parse(json));
		}
	};
	
	//Step 3: Call xhr.open(), passing in 2 strings for the HTTP Method and URL 
	xhr.open("GET", "http://localhost:8088/ERSProject/ReimbursementRequestServlet"); 
	
	//Step 4: Call xhr.send() to actually fire off your HTTP Request
	xhr.send();
}



const populatePendingRequestTable = (listofPendingRequests) => {
	//the for...of loop is JavaScript's version of the enhanced for loop
	//the for...in loop iterates over every property of a JS object
	for (let request of listOfPendingRequest){
		//create a table cell for each property of the object
		const tdRequestId = document.createElement("td");
		const tdReimbursementAmount = document.createElement("td");
		const tdManagerId = document.createElement("td");
		const tdEmpId = document.createElement("td");
		
		//set value of each cell
		tdRequestId.textContent = request.requestid;
		tdReimbursementAmount.textContent = request.reimbursementamount;
		tdManagerId.textContent = request.managerid;
		tdEmpId.textContent = request.empid;
		
		//Create a row to be appended onto our table
		const row = document.createElement("tr");
		
		//Set the td's to the corresponding order of the table header
		row.appendChild(tdRequestId);
		row.appendChild(tdReimbursementAmount);
		row.appendChild(tdManagerId);
		row.appendChild(tdEmpId);
		
		//Append the row onto table of pendingRequests
		document.getElementById("pendingRequestTable").appendChild(row);
	}
}


const getAllApprovedRequests = () => {
	//Step 1: Create an XMLHttpRequest object
	const xhr = new XMLHttpRequest();
	
	//Step 2: Assign a callback function to xhr.onreadystatechange
	xhr.onreadystatechange = () => {
		//Step 5: Handle each of the different possible outcomes from making this request 
		if (xhr.status === 200 && xhr.readyState === 4){
			const json = xhr.responseText;
			populateApprovedRequestTable(JSON.parse(json));
		}
	};
	
	//Step 3: Call xhr.open(), passing in 2 strings for the HTTP Method and URL 
	xhr.open("GET", "http://localhost:8088/ERSProject/"); //what would the URL be 
	
	//Step 4: Call xhr.send() to actually fire off your HTTP Request
	xhr.send();
}



const populateApprovedRequestTable = (listofApprovedRequests) => {
	//the for...of loop is JavaScript's version of the enhanced for loop
	//the for...in loop iterates over every property of a JS object
	for (let request of listOfApprovedRequest){
		//create a table cell for each property of the object
		const tdRequestId = document.createElement("td");
		const tdReimbursementAmount = document.createElement("td");
		const tdManagerId = document.createElement("td");
		const tdEmpId = document.createElement("td");
		
		//set value of each cell
		tdRequestId.textContent = request.requestid;
		tdReimbursementAmount.textContent = request.reimbursementamount;
		tdManagerId.textContent = request.managerid;
		tdEmpId.textContent = request.empid;
		
		//Create a row to be appended onto our table
		const row = document.createElement("tr");
		
		//Set the td's to the corresponding order of the table header
		row.appendChild(tdRequestId);
		row.appendChild(tdReimbursementAmount);
		row.appendChild(tdManagerId);
		row.appendChild(tdEmpId);
		
		//Append the row onto table of pendingRequests
		document.getElementById("approvedRequestTable").appendChild(row);
	}
}


const getAllDeniedRequests = () => {
	//Step 1: Create an XMLHttpRequest object
	const xhr = new XMLHttpRequest();
	
	//Step 2: Assign a callback function to xhr.onreadystatechange
	xhr.onreadystatechange = () => {
		//Step 5: Handle each of the different possible outcomes from making this request 
		if (xhr.status === 200 && xhr.readyState === 4){
			const json = xhr.responseText;
			populateDeniedRequestTable(JSON.parse(json));
		}
	};
	
	//Step 3: Call xhr.open(), passing in 2 strings for the HTTP Method and URL 
	xhr.open("GET", "http://localhost:8088/ERSProject/"); //what would the URL be 
	
	//Step 4: Call xhr.send() to actually fire off your HTTP Request
	xhr.send();
}


const populateDeniedRequestTable = (listofDeniedRequests) => {
	//the for...of loop is JavaScript's version of the enhanced for loop
	//the for...in loop iterates over every property of a JS object
	for (let request of listOfDeniedRequest){
		//create a table cell for each property of the object
		const tdRequestId = document.createElement("td");
		const tdReimbursementAmount = document.createElement("td");
		const tdManagerId = document.createElement("td");
		const tdEmpId = document.createElement("td");
		
		//set value of each cell
		tdRequestId.textContent = request.requestid;
		tdReimbursementAmount.textContent = request.reimbursementamount;
		tdManagerId.textContent = request.managerid;
		tdEmpId.textContent = request.empid;
		
		//Create a row to be appended onto our table
		const row = document.createElement("tr");
		
		//Set the td's to the corresponding order of the table header
		row.appendChild(tdRequestId);
		row.appendChild(tdReimbursementAmount);
		row.appendChild(tdManagerId);
		row.appendChild(tdEmpId);
		
		//Append the row onto table of pendingRequests
		document.getElementById("deniedRequestTable").appendChild(row);
	}
}


const createRequest = () => {
	//Step 1: create XHR object
	const xhr = new XMLHttpRequest();
	//Step 1.5: Create a helper variable for your form data
	const formData = parseForm();
	//Step2: assign callback function to xhr.onreadystatechange
	xhr.onreadystatechange = () => {
		if (xhr === 200 && xhr.readState === 4) {
			const json = xhr.responseText;
			console.log(json);
		}
	}
	
	//Step 3: open up the request
	xhr.open("POST", "http://localhost:8088/ERSProject/ReimbursementRequestServlet");
	
	//Step 4: send off the request
	xhr.send(JSON.stringify(formData));
}

const parseForm = () => {
	const requestIdText = document.getElementById("requestId").value;
	const reimbursementText = document.getElementById("reimbursement").value;
	const employeeIdText = document.getElementById("employeeId").value;
	
	return {
		requestId: requestIdText,
		reimbursementAmount: reimbursementText,
		employeeId: employeeIdText
		
	}
}