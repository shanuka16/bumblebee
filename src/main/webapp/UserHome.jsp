<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="nav-item">
		  <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Bumble-Bee</a>
		</li>
		<li class="nav-item">
		   <a class="nav-link " href="#">About Us</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="#">Buy Products</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="#">Contact Us</a>
		</li>
		<li class="nav-item">
		  	<form method="post" action="customer">
				<input type="hidden" name="type" value="logout">
				<button type="submit" class="btn btn-danger">LOGOUT</button>							
			</form>
		</li>
		
	</ul>
</body>
</html>