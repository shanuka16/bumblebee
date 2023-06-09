<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Categories</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
	<ul class="nav nav-tabs">
		  <li class="nav-item">
		    <a class="nav-link " href="AdminHome.jsp" tabindex="-1">Bumblee-Bee</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="CategoryController">View All Categories</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link active" href="addCategory.jsp">Add Category</a>
		  </li>
		  
		</ul>
	<div class="container">
		
		<br><p>${message}</p><br>
		<h3>Add Category</h3><br>
		<form method="post" action="CategoryController">
			<div class="row">
				<div class="col-md-3">
					<lable for="txtCategoryName">Name</lable>
				</div>
				<div class="col-md-5">
					<input type="text" id="txtCategoryName" name="categoryName" class="form-control" Required/>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">					
				</div>
				<div class="col-md-3">
					<input type="hidden" name="type" value="add"><br/>
			<button type="submit" class="btn btn-success form-control">Add</button>
				</div>
			</div>
						
			
			
		</form>
	</div>
</body>
</html>