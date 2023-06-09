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

<link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
<script>
	$(document).ready(function () {
	    $('#example').DataTable();
	});
</script>
</head>
<body>
	<ul class="nav nav-tabs">
		  <li class="nav-item">
		    <a class="nav-link" href="AdminHome.jsp" tabindex="-1">Bumblee-Bee</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link active" href="CategoryController">View Customers</a>
		  </li>
		</ul>
	<div class="container">
		<br><h3>View All Customers</h3>
		<p>${message}</p><br>
		<table id="example" class="display" style="width:100%">
			<thead>
			
				<tr>
					<th>Customer ID</th>
					<th>Customer Name</th>
					<th>Date Of Birth</th>
					<th>Contact</th>
					<th>Mail</th>
					<th>Username</th>
					<th>Password</th>
					<th>Loan Taken</th>
					<th>Loan Details</th>
					
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
							<form method="get" action="loan">
								<input type="hidden" name="customerIdLoan" value="${customer.customerId}">
								<input type="hidden" name="type" value="specific">
								<button type="submit" class="btn btn-secondary">Loan Status</button>							
							</form>
						</td>
					</tr>
				</tag:forEach>			
			</tbody>
			
		</table>
	</div><br><br><br><br>
</body>
</html>