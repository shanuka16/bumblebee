<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category</title>
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
		    <a class="nav-link active" href="CategoryController">View All Categories</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link " href="addCategory.jsp">Add Category</a>
		  </li>
		</ul>
	<div class="container">
		<br><h3>View All Categories</h3>
		<p>${message}</p><br>
		
		<div class="row">
				<div class="col-md-3"><a href="addCategory.jsp"><button class="btn btn-primary form-control">ADD CATEGORY</button><br></a>
		<br></div>
		</div>
							
		<table id="example" class="display" style="width:100%">
			<thead>
				<tr>
					<th>Category Code</th>
					<th>Category Name</th>
					
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>		
			<tbody>
				<tag:forEach var ="category" items="${categoryList}">
					<tr>
						<td>${category.categoryId}</td>
						<td>${category.categoryName}</td>
						
						<td>
							<form method="get" action="CategoryController">
								<input type="hidden" name="categoryId" value="${category.categoryId}">
								<input type="hidden" name="type" value="specific">
								<button type="submit" class="btn btn-secondary">UPDATE</button>							
							</form>
						</td><td>
							<form method="post" action="CategoryController">
								<input type="hidden" name="categoryId" value="${category.categoryId}">
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