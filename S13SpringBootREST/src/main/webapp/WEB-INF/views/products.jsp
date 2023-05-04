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
<form action="products" method="post">

	<input type="text" name="name">
	<input type="text" name="description">
	<input type="text" name="price">
	<input type="submit" value="Submit"/>
</form>
<p>${msg}</p>
<ul>
<c:forEach items="${products}" var="product">
	<li> ${product.id}|| ${product.name}|| ${product.description}</li>
</c:forEach>
</ul>
</body>
</html>