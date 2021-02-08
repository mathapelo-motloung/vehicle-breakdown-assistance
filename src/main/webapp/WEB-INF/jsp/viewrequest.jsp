<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.Request"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

	<h2>View Request</h2>
	<hr>
<div style="margin-top: 25px;"></div>
	<form action="filterrequest" method="post">


		<div>
			<table>
				<tr>
					<td>Description</td>
					<td>Date</td>

				</tr>

				<u:forEach items="${request}" var="r">
					<tr>

						<td>${r.getDescription()}</td>
						<td>${r.getDate()}</td>


					</tr>
				</u:forEach>
			</table>
		</div>
	</form>

</body>
</html>