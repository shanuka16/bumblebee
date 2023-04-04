<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
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
		</ul></br>
	<div class="container">
	<h3>Add Product</h3>
		
		<br><p>${message}</p><br>
		<form method="post" action="product">
			<div class="row">
				<div class="col-md-3"><lable for="txtProductName">Name</lable></div>
				<div class="col-md-5"><input type="text" id="txtProductName" name="productName" class="form-control" Required/></br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtPrice">Price</lable></div>
				<div class="col-md-5"><input type="number" id="txtPrice" name="price" class="form-control" Required/></br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtProductDescription">Description</lable></div>
				<div class="col-md-5"><input type="text" id="txtProductDescription" name="description" class="form-control" Required/></br></div>
			</div>
			
			<div class="row">
				<div class="col-md-3"><lable for="txtCategory">Category</lable></div>
				<div class="col-md-5">
				<select id="txtCategory" name="category" class="form-control" Required/>
					<tag:forEach var ="category" items="${categoryList}">
						<option>${category.categoryName}</option>
					</tag:forEach>	</br>			
				</select>
				</div>
			</div>
			</br>
			<div class="row">
				<div class="col-md-4"></div>
				<input type="hidden" name="type" value="add">
				<div class="col-md-3"><button type="submit" class="btn btn-success form-control">Add Product</button></div>
			</div>
		
		</form>
	</div>

</body>
</html>