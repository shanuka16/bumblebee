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
		<br><h3>Customer Registration</h3><br>
		
		<br><p>${message}</p>
		<form method="post" action="customer">
		
			<div class="row">
				<div class="col-md-3"><lable for="txtCustomerName">Customer Name</lable></div>
				<div class="col-md-5"><input type="text" id="txtCustomerName" name="customerName" class="form-control" Required/><br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtCustomerDOB">Customer Date Of Birth</lable></div>
				<div class="col-md-5"><input type="date" id="txtCustomerDOB" name="dob" class="form-control" Required/><br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtContact">Customer Contact</lable></div>
				<div class="col-md-5"><input type="number" id="txtContact" name="customerContact" class="form-control" Required/><br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtCustomerMail">Customer Mail</lable></div>
				<div class="col-md-5"><input type="email" id="txtCustomerMail" name="custMail" class="form-control" Required/><br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtCustomerUname">Customer Username</lable></div>
				<div class="col-md-5"><input type="text" id="txtCustomerUname" name="custUserName" class="form-control" Required/><br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtCustomerPw">Password</lable></div>
				<div class="col-md-5"><input type="password" id="txtCustomerPw" name="custPassword" class="form-control" Required/><br></div>
			</div>
			
			<div class="row">
				<div class="col-md-4"></div>
				<input type="hidden" name="type" value="add"><br/>
				<div class="col-md-3"><button type="submit" class="btn btn-success form-control">Register</button></div><br><br>
			</div>
		
		</form>
	</div>
</body>
</html>