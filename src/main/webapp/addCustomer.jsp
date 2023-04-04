<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
	<ul class="nav nav-tabs">
		<li class="nav-item">
		  <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Bumble-Bee</a>
		</li>
		<li class="nav-item">
		   <a class="nav-link" href="adminLogin.jsp">Admin Login</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link " href="customerLogin.jsp">Customer Login</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link active" href="addCustomer.jsp">Customer Signup</a>
		</li>
	</ul>
	<div class="container">
		
		
		<br><p>${message}</p><br>
		<form method="post" action="customer">
			<lable for="txtCustomerName">Customer Name</lable>
			<input type="text" id="txtCustomerName" name="customerName" class="form-control" Required/>
			
			<lable for="txtCustomerDOB">Customer Date Of Birth</lable>
			<input type="date" id="txtCustomerDOB" name="dob" class="form-control" Required/>
			
			<lable for="txtContact">Customer Contact</lable>
			<input type="number" id="txtContact" name="customerContact" class="form-control" Required/>
			
			<lable for="txtCustomerMail">Customer Mail</lable>
			<input type="text" id="txtCustomerMail" name="custMail" class="form-control" Required/>
			
			<lable for="txtCustomerUname">Customer Username</lable>
			<input type="text" id="txtCustomerUname" name="custUserName" class="form-control" Required/>
			
			<lable for="txtCustomerPw">Password</lable>
			<input type="password" id="txtCustomerPw" name="custPassword" class="form-control" Required/>
			
			
			<input type="hidden" name="type" value="add"><br/>
			<button type="submit" class="btn btn-success">Register</button>
			
		</form>
	</div>
</body>
</html>