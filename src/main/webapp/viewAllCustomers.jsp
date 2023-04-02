<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		
		<br><p>${message}</p><br>
		<table class="table">
			<thead>
			
				<tr class="table-dark">
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Date Of Birth</th>
					<th>Contact</th>
					<th>Mail</th>
					<th>Username</th>
					<th>Password</th>
					<th>Loan Status</th>
				</tr>
			</thead>		
			<tbody>
				<tag:forEach var ="customer" items="${customerList}">
					<tr>
						<td>${customer.customerId}</td>
						<td>${customer.customerName}</td>
						<td>${customer.dob}</td>
						<td>${customer.customerContact}</td>
						<td>${customer.custMail}</td>						
						<td>${customer.custUserName}</td>
						<td>${customer.custPassword}</td>
						<td>${customer.loanStatus}</td>
						<td>
							<form method="get" action="customer">
								<input type="hidden" name="customerId" value="${customer.customerId}">
								<input type="hidden" name="type" value="specific">
								<button type="submit" class="btn btn-warning">UPDATE</button>							
							</form>
						</td><td>
							<form method="post" action="customer">
								<input type="hidden" name="customerId" value="${customer.customerId}">
								<input type="hidden" name="type" value="delete">
								<button type="submit" class="btn btn-danger">DELETE</button>							
							</form>
						</td>
					</tr>
				</tag:forEach>			
			</tbody>
		</table>
	</div>
</body>
</html>