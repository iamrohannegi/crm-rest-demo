<!DOCTYPE html>

<html>
	<head>
		<title>REST Service Dem - Rohan Negi</title>
	</head>
	
	<body>
		<h1>REST Service for CRUD operations on CRM - Rohan Negi</h1>
		<hr><br>
		
		<h2>Instructions to use:</h2>
		<ol>
			<li>GET all customers by using GET HTTP call on ${pageContext.request.contextPath}/api/customers
				<ul>
					<li><a href="${pageContext.request.contextPath}/api/customers">Click here to GET all customers</a></li>
				</ul>
			</li>
			<li>GET single customer by using customer id (eg: GET HTTP call on ${pageContext.request.contextPath}/api/customers/{customerID})  replace {customerID} with id like 2</li>
			<li>DELETE customer by using customer id (eg: DELETE HTTP call on ${pageContext.request.contextPath}/api/customers/{customerID}) replace {customerID} with id like 2</li>
			<li>Create new customer by sending customer info in json (eg: PUT HTTP call on  ${pageContext.request.contextPath}/api/customers)
				<ul>
					<li>JSON FORMAT: { firstName: "Rohan", lastName:"Negi", email:"abc@gmail.com"}</li>
				</ul>
			</li>
		</ol>
	</body>
</html>