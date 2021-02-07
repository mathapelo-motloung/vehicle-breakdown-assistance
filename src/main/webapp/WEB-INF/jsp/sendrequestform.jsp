<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.error {
	color: red;
	font-style: italic;
}
</style>


</head>
<body>
	<h2>Send Request</h2>

	<form method="post" action="/sendrequestfrom">
		<tr>
			<td><input type="number" name="Request Id: " required></td>
		</tr>
		<tr>
			<td><input type="number" name="User Id: " required></td>
		</tr>
		<tr>
			<td><input type="text" name="Description:" required></td>
		</tr>
		<tr>
			<td><input type="date" name="Date: " required></td>
		</tr>
		<tr>
			<input type="submit">
		</tr>
	</form>
</body>
</html>