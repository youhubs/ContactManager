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
					<th>${status.index + 1}</th>
					<th>${contact.name}</th>
					<th>${contact.email}</th>
					<th>${contact.address}</th>
					<th>${contact.phone}</th>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>