<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
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
		    <a class="nav-link " href="AdminHome.jsp" tabindex="-1">Bumblee-Bee</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link active" href="product">View Products</a>
		  </li>
		</ul>
	<div class="container">
		<br><h3>View All Products</h3>
		<p>${message}</p><br>
		<form method="get" action="CategoryController">
			<input type="hidden" name="type" value="select">
			<button type="submit" class="btn btn-primary">ADD NEW PRODUCT</button>							
		</form></br>
		<table id="example" class="display" style="width:100%">
			<thead>
				<tr>
					<th>Product Code</th>
					<th>Product Name</th>
					<th>Price</th>
					<th>Description</th>
					<th>Category</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>		
			<tbody>
				<tag:forEach var ="product" items="${productList}">
					<tr>
						<td>${product.productCode}</td>
						<td>${product.name}</td>
						<td>${product.price}</td>
						<td>${product.description}</td>
						<td>${product.category}</td>
						<td>
							<form method="get" action="product">
								<input type="hidden" name="productCode" value="${product.productCode}">
								<input type="hidden" name="type" value="specific">
								<button type="submit" class="btn btn-secondary">UPDATE</button>							
							</form>
						</td><td>
							<form method="post" action="product">
								<input type="hidden" name="productCode" value="${product.productCode}">
								<input type="hidden" name="type" value="delete">
								<button type="submit" class="btn btn-danger">DELETE</button>							
							</form>
						</td>
					</tr>
				</tag:forEach>			
			</tbody>
			
		</table>
	</div><br><br><br><br>
	
</body>
</html>