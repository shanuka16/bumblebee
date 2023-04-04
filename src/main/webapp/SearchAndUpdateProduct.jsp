<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
	<ul class="nav nav-tabs">
		  <li class="nav-item">
		    <a class="nav-link" href="AdminHome.jsp" tabindex="-1">Bumblee-Bee</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="product">View All Products</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link active" href="#">Update Product</a>
		  </li>
		</ul>	
	<div class="container">
		
		<br><p>${message}</p><br>
		
		
		<h3>Update The Product<br/></h3>
		<form method="post" action="product">
			<div class="row">
				<div class="col-md-3"><lable for="txtProductCode">Product Code</lable></div>
				<div class="col-md-5"><input type="text" id="txtProductCode" name="productCode" class="form-control" value="${product.productCode}"/><br/></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtProductName">Product Name</lable></div>
				<div class="col-md-5"><input type="text" id="txtProductName" name="productName" class="form-control" value="${product.name}"  Required/><br/></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtPrice">Product Price</lable></div>
				<div class="col-md-5"><input type="number" id="txtPrice" name="price" class="form-control" value="${product.price}"  Required/><br/></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtProductDescription">Product Description</lable></div>
				<div class="col-md-5"><input type="text" id="txtProductDescription" name="productDescription" class="form-control" value="${product.description}"  Required/><br/></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtProductCategory">Product Category</lable></div>
				<div class="col-md-5"><input type="text" id="txtProductCategory" name="productCategory" class="form-control" value="${product.category}"  Required/><br/></div>
			</div>
			
			<div class="row">
				<div class="col-md-4"></div>
				<input type="hidden" name="type" value="update">
				<div class="col-md-3"><button type="submit" class="btn btn-warning form-control">Update</button></div>
			</div>
				
		</form>
	</div>
	
</body>
</html>