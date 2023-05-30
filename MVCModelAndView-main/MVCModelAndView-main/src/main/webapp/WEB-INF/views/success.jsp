<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info</title>
</head>
<body>
	<h3>Email is, ${user.getEmail() }</h3>
	<h3>Name is, ${user.userName }</h3>
	<h3>Password is, ${user.getPassword() }</h3>
</body>
</html>