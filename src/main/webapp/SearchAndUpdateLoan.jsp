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
		    <a class="nav-link" href="CategoryController">Store</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="addCategory.jsp">Register Category</a>
		  </li>		  
		</ul>
	<div class="container">
			
		<br><p>${message}</p><br>
		
		
		<h3>View Loan</h3>
			
			<lable for="txtLoanCustCode">Customer Id</lable>
			<input type="text" id="txtLoanCustCode" name="customerIdLoan" class="form-control" value="${loan.customerIdLoan}"/>
			
			<lable for="txtLoanUsed">Loan Used</lable>
			<input type="text" id="txtLoanUsed" name="usedAmount" class="form-control" value="${loan.usedAmount}"/>
			
			<lable for="txtLoanBalance">Loan Balance</lable>
			<input type="text" id="txtLoanBalance" name="loanBalance" class="form-control" value="${loan.loanBalance}"/>
			
			<lable for="txtLoanInstOne">Installment One</lable>
			<input type="text" id="txtLoanInstOne" name="installmentOne" class="form-control" value="${loan.installmentOne}"/>
			
			<lable for="txtLoanInstTwo">Installment Two</lable>
			<input type="text" id="txtLoanInstTwo" name="installmentTwo" class="form-control" value="${loan.installmentTwo}"/>
			
			<lable for="txtLoanInstThree">Installment Three</lable>
			<input type="text" id="txtLoanInstThree" name="installmentThree" class="form-control" value="${loan.installmentThree}"/>
			
			
			<lable for="txtLoanInstTwo">Loan Start Date</lable>
			<input type="text" id="txtLoanInstTwo" name="installmentTwo" class="form-control" value="${loan.startDate}"/>
			
			<lable for="txtLoanInstThree">Loan End Datee</lable>
			<input type="text" id="txtLoanInstThree" name="installmentThree" class="form-control" value="${loan.endDate}"/>
			
	</div>
</body>
</html>