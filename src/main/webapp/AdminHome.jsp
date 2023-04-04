<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		 <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Bumble-Bee</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarText">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item">
		        <a class="nav-link" href="CategoryController">Categories</a>
		      </li>
		      <li class="nav-item">
		         <a class="nav-link" href="product">Products</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="customer">Customers</a>
		      </li>
		      <li class="nav-item">
				  <form method="post" action="admin">
					<input type="hidden" name="type" value="logout">
					<button type="submit" class="btn btn-danger">LOGOUT</button>							
				</form>
			</li>
		    </ul>
		  </div>
		</nav>

</body>
</html>