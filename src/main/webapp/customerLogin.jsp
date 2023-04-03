<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
		
	</head>
<body>
	<div class="container">
		<ul class="nav nav-tabs">
		  <li class="nav-item">
		    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">BUMBLE-BEE</a>
		  </li>
		</ul>
		<div class="row">
			<div class="col-md-6">
				<form action="customer" method="post">
				  <div class="mb-3">
				    <label for="username" class="form-label">Username</label>
				    <input type="text" class="form-control" id="username" aria-describedby="emailHelp">
				  </div>
				  <div class="mb-3">
				    <label for="password" class="form-label">Password</label>
				    <input type="password" class="form-control" id=password>
				  </div>
				  <input type="hidden" name="type" value="specific">
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
			<div class="col-md-6"></div>
		</div>
	</div>
	
</body>
</html>
