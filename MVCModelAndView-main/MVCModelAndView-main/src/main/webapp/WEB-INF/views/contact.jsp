<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Contact Us Page</title>
  </head>
  <body>
	<div class="container mt-4">
	<h3 class="text-center">${message }</h3>
		<form action="processform" method="POST" modelAttribute="user">
			<div class="form-group">
				<label for="userEmail">Email address</label> 
				<input type="email" class="form-control" 
					id="userEmail"
					placeholder="Enter email" 
					name="userEmail"
					path="userEmail"> 
			</div>
			<div class="form-group">
				<label for="userName">User Name</label> <input
					type="text" class="form-control" id="userName"
					placeholder="Enter UserName" 
					name="userName"
					path="userName">
			</div>
			<div class="form-group">
				<label for="userPassword">Password</label> <input
					type="password" class="form-control" id="userPassword"
					placeholder="Enter Password" 
					name="userPassword"
					path="password">
			</div>
		
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>