<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loans</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
	<ul class="nav nav-tabs">
		  <li class="nav-item">
		    <a class="nav-link" href="AdminHome.jsp" tabindex="-1" >Bumblee-Bee</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="customer">View All Customers</a>
		  </li>		  
		</ul>
	<div class="container">
			
		<br><p>${message}</p><br>
		
		
		<h3>View Loan<br></h3><br>
		
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanCustCode">Customer Id</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanCustCode" name="customerIdLoan" class="form-control" value="${loan.customerIdLoan}"/><br></div>
			</div>
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanUsed">Loan Used</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanUsed" name="usedAmount" class="form-control" value="${loan.usedAmount}"/><br></div>
			</div>
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanBalance">Loan Balance</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanBalance" name="loanBalance" class="form-control" value="${loan.loanBalance}"/><br></div>
			</div>
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanInstOne">Installment One</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanInstOne" name="installmentOne" class="form-control" value="${loan.installmentOne}"/><br></div>
			</div>
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanInstTwo">Installment Two</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanInstTwo" name="installmentTwo" class="form-control" value="${loan.installmentTwo}"/><br></div>
			</div>
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanInstThree">Installment Three</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanInstThree" name="installmentThree" class="form-control" value="${loan.installmentThree}"/><br></div>
			</div>
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanInstTwo">Loan Start Date</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanInstTwo" name="installmentTwo" class="form-control" value="${loan.startDate}"/><br></div>
			</div>
			<div class="row">
				<div class="col-md-3"><lable for="txtLoanInstThree">Loan End Date</lable></div>
				<div class="col-md-5"><input type="text" id="txtLoanInstThree" name="installmentThree" class="form-control" value="${loan.endDate}"/><br><br><br></div>
			</div>
	</div>
</body>
</html>