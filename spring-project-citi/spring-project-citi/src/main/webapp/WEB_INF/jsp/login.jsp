

<html>

<head>
<title>Login Page</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">

<style type="text/css">
  <%@include file="style.css" %>
</style>

</head>

<body>
	
	<h2>${errorMsgs}</h2>
	<div class="login-form">

		<div class="container-fluid">
			<form method="post" action="login">

				<div class="mt-3">
					<input type="text" class="form-control" name="userId"
						placeholder="User ID" />
				</div>
				<div class="mt-3">
					<input type="password" class="form-control" name="password"
						placeholder="Password" />
				</div>
				<button type="submit" class="btn btn-dark btn-block mt-3">Login</button>

			</form>
		</div>
	</div>

	
</body>

</html>