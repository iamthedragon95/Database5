<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Single Product DropDown</title>
</head>
<body>
<table border="1">
		<th>ProductID</th>
		<th>Name</th>
		<th>Price</th>
		<th>Description</th>
		<th>Category</th>
		<c:forEach items="${ProductList}" var="product">
			<tr>
				<td>${product.productId}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.description}</td>
				<td>${product.category }</td>
				<td><a href="edit/${product.productId}">Edit</a> </td>
		    <td><a href="delete/${product.productId}">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table>


</body>
</html>