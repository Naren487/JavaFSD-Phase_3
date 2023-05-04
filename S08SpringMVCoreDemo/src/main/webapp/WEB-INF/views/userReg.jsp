<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registeruser" method="post">

	<input type="text" name="name">
	<input type="email" name="email">
	<input type="submit" value="Submit"/>
	<input type="password" name="password">
</form>
<p>${msg}</p>
<ul>
<c:forEach items="${users}" var="user">
	<li> ${user.id}|| ${user.name}|| ${user.email}</li>
</c:forEach>
</ul>
</body>
</html>