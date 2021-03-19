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
<jsp:include page="nav.jsp"></jsp:include>
	<h2>View Feedback</h2>
	<hr>
	<h3 align="right">You're logged in as ${sessionName} </h3>
	<br>
	
		<div>
		
			
			<table>
				<tr>
					<th>Name</th>
					<th>Surname</th>
					<th>Type</th>
					<th>Feedback Description</th>
					<th>Date and Time</th>
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