<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<<<<<<< HEAD

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
>>>>>>> 9d3350d2300a0a7963cb848da7789d4718e565dd
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
	

<h2>View Users</h2>
<hr>

	

	<div style="margin-top: 25px;"></div>	
	<form action="filteruser" method="post">
		<div>
			<tr>
				<td><label>Filter Users</label></td>
				<td><select id="roles" name="user_type">
						<option value="ROLE_USER">User</option>
						<option value="ROLE_MECHANIC">Mechanic</option>
						<option value="all">All</option>
				</select></td>
			</tr>
			<tr>
				
				<td><input type="submit" name="filter" value="submit"></td>
			</tr>
		</div>
	</form>

	<div style="margin-top:25px;"></div>
	
	<form form action="filteruser" method="post">
	<div>
		<table>
		<tr>
		<td>user Id</td>
		<td>Name </td>
		<td>Surname </td>
		<td>Email Address</td>
		<td>User Type</td>
		<td>Cell Number</td>
		<td>Location </td>
		<td>Username </td>
		<td>Password </td>
		<td>Status </td>
		<td>Enable/Disable </td>
		</tr>
		
		<u:forEach items="${user}" var="p">
		<tr>
		
		<td>${p.getUser_id()}</td>
		<td>${p.getFname()}</td>
		<td>${p.getLname()}</td>
		<td>${p.getEmail()}</td>
		<td>${p.getUsertype()}</td>
		<td>${p.getCellno()}</td>
		<td>${p.getLocation()}</td>
		<td>${p.getUsername()}</td>
		<td>${p.getPassword()}</td>
		<td>${p.getStatus()}</td>
		<td>
		<u:if test="${p.getStatus().equals('BLOCKED')}">
			<input type="button" name="enable" value="enable"/>
		</u:if>
		<u:if test="${p.getStatus().equals('NOT BLOCKED')}">
			<input type="button" name="enable" value="disable"/>
		</u:if>
		</td>	
		</tr>
		</u:forEach>
		</table>
	</div>
	</form>

</body>
</html>