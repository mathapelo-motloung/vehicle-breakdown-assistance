<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.User"%>
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
table, tr, td, th {
	border: 1px solid grey;
	border-collapse: collapse;
	width: 600px;
	padding: 10px;
	font-size: 20px;
}

</style>
<script>
	function validate(frm) {
		if (frm.id.value == "") {
			alert("Id is required...");
			return false;
		}
		return true;
	}
</script>
</head>
<body>

	<h2>Search for Mechanics</h2>
	<hr>
	
	<form action="filtersearch" method="post"
		onsubmit="return validate(this);">
<div>
			Search <input list="locations" name="location"> *
			<button>Go</button>

			<datalist id="location">
				<u:forEach items="${user}" var="p">
					<option value="${p.getLocation()}">
				</u:forEach>
			</datalist>
		</div>
		<div>
			<input type="hidden" name="action" value="search">

		</div>
	</form>

	<div style="margin-top: 25px;"></div>

	<form form action="filtersearch" method="post">
		<div>
			<table>
				<tr>
					<td>Name</td>
					<td>Surname</td>
					<td>Email Address</td>
					<td>Cell Number</td>
					<td>Location</td>
					<td>Username</td>	
					<td></td>	
				</tr>
				<u:forEach items="${user}" var="p">
					<tr>
						<td>${p.getFname()}</td>
						<td>${p.getLname()}</td>
						<td>${p.getEmail()}</td>
						<td>${p.getCellno()}</td>
						<td>${p.getLocation()}</td>
						<td>${p.getUsername()}</td>
						<td><a href="/makerequest?mechanicId=${p.getUser_id()}">Send Request</a></td>
					</tr>
				</u:forEach>
			</table>
		</div>
	</form>
</body>
</html>