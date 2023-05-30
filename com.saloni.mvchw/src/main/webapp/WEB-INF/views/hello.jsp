<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<h1>Thank God Its Sunday!!!!</h1>

<%
String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");

	List<String> friends= (List<String>)request.getAttribute("f");
%>
<h2>Name is <%=name%></h2>
<h2>Id is <%=id%></h2>

<%
for(String s:friends){
out.println(s);
}
%>
</body>
</html>