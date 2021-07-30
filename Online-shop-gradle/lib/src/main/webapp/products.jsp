
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.phoenix.data.Product"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<%@include file="header.html" %>
<body bgcolor="red">
	<%
		HttpSession ss = request.getSession(false);
	
		if(ss != null){ %>
		
		<%System.out.println("Product Session ID: " + ss.getId());%>
		<p>Dear <%= ss.getAttribute("user") %> Select Products of your choice.</p>
		<% List<Product> products = (List<Product>)ss.getAttribute("products"); %>
		
		<table border="1">
			<tr>
				<td>Product Id</td>
				<td>Name</td>
				<td>Brand</td>
				<td>Price</td>
			</tr>
			<% for(Product product : products){ %>	
			<tr>
				<td><%= product.getId() %></td>
				<td><%= product.getName() %></td>
				<td><%= product.getBrand() %></td>
				<td><%= product.getPrice() %></td>
			</tr>
			<%} %>
		</table>
	<% } else { %>
		<h2 style="color:red;">Sorry! Your Session is expired.</h2>
	<% } %>
</body>
<%@include file="footer.html" %>
</html>