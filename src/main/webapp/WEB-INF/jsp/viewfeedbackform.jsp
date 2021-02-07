<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.Feedback"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table, th, td {

	padding: 10px;
	border: 1px solid black;
	border-collapse: collapse;
}
</style>

</head>
<body>
	<h2>View Feedback</h2>
	<hr>
		<div>
			<table>
				<tr>
					<td>Name</td>
					<td>Surname</td>
					<td>Type</td>
					<td>Feedback Description</td>
					<td>Date and Time</td>
				</tr>
				<u:forEach items="${feedback}" var="f">
					<tr>
						<td>${f.getUser().getFname()}</td>
						<td>${f.getUser().getLname()}</td>
						<td>${f.getUser().getUsertype()}</td>
						<td>${f.getDescription()}</td>
						<td>${f.getDate()}</td>
					</tr>
				</u:forEach>
			</table>
		</div>
</body>
</html>