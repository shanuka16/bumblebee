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
	<div class="container">
		<ul class="nav nav-tabs">
		  <li class="nav-item">
		    <a class="nav-link" href="AdminHome.jsp" tabindex="-1">Bumblee-Bee</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="product">Store</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="addProduct.jsp">Register Product</a>
		  </li>
		</ul>	
		<br><p>${message}</p><br>
		
		
		<h3>Update The Product</h3>
		<form method="post" action="product">
			<lable for="txtProductCode">Product Code</lable>
			<input type="text" id="txtProductCode" name="productCode" class="form-control" value="${product.productCode}"/>
			
			<lable for="txtProductName">Product Name</lable>
			<input type="text" id="txtProductName" name="productName" class="form-control" value="${product.name}"/>			
			<lable for="txtPrice">Product Price</lable>
			<input type="number" id="txtPrice" name="price" class="form-control" value="${product.price}"/>
			<input type="hidden" name="type" value="update">
			<lable for="txtProductDescription">Product Description</lable>
			<input type="text" id="txtProductDescription" name="productDescription" class="form-control" value="${product.description}"/>			
			<lable for="txtProductCategory">Product Category</lable>
			<input type="text" id="txtProductCategory" name="productCategory" class="form-control" value="${product.category}"/>			
			<br/>
			<button type="submit" class="btn btn-warning">Update</button>			
		</form>
	</div>
	
</body>
</html>