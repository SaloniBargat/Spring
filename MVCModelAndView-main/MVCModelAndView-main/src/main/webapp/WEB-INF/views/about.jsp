<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About us Page</title>
</head>
<body>
	<h1>About us Page</h1>
	
	<%
		/*String name = (String) request.getAttribute("name");*/
	%>
	<h2>Name is 
	<%-- <%=name --%>
	${name} 
	</h2>
	
	<hr>
	<c:forEach var="item" items="${marks }">
	<h3>${item}</h3>
	<h3><c:out value="${item }" ></c:out></h3>
	</c:forEach>
</body>
</html>