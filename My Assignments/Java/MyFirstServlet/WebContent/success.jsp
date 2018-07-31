<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login success</title>
</head>
<body>
<h3>Successfully logged in</h3>
<%
String str = (String)request.getAttribute("hi");
%>
Hello <%=str %>
</body>
</html>