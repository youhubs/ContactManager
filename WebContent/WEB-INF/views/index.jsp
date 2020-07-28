<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Manager</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: seperate;
	border-spacing: 5px;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Contact List</h1>
		<h3>
			<a href="new">New Contact</a>
		</h3>
		<table style="border-collapse: separate; border-spacing: 5px;">
			<tr>
				<th>No</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Phone</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${listContact }" var="contact" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${contact.name}</td>
					<td>${contact.email}</td>
					<td>${contact.address}</td>
					<td>${contact.phone}</td>
					<td><a href="edit?id=${contact.id}">Edit</a> &nbsp;&nbsp; <a
						href="delete?id=${contact.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>