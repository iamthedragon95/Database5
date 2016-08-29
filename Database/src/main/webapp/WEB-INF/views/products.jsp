<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/includes.jsp"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Database</title>
</head>
<body>
<a href=imageupload>Upload Photo here</a>
<h1>Product Data</h1>
<form:form action="products.do" method="POST" commandName="product">
	<table>
		<tr>
			<td>Product ID</td>
			<td><form:input path="ProductId" /></td>
		</tr>
		<tr>
			<td> Name</td>
			<td><form:input path="Name" /></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><form:input path="Price" /></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><form:input path="Description" /></td>
		</tr>
		<tr>
<td>Category</td>
<td>Imagename</td>
<form:select path="Category" name="CATEGORY">
<form:option selected="guitar" value="guitar">guitar</form:option>
<form:option value="drums">drums</form:option>
<form:option value="violins">violins</form:option>
</form:select>
</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Save" />
				<input type="submit" name="action" value="Update" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ProductID</th>
	<th>Name</th>
	<th>Price</th>
	<th>Description</th>
	<th>Category</th>
	<th>Imagename</th>
	<c:forEach items="${ProductList}" var="product">
		<tr>
			<td>${product.productId}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>${product.description}</td>
			<td>${product.category }</td>
			<td>${product.imagename }</td>
		</tr>
	</c:forEach>
</table>
 
<a href= "product view" > View Here</a>
</body>
</html>