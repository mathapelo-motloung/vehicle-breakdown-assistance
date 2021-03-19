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
<jsp:include page="nav.jsp"></jsp:include>

	<h2>View Request</h2>
	<hr>
	<h3 align="right">You're logged in as ${sessionName} </h3>
	
	<div style="margin-top: 25px;"></div>
	
		<div>
			<table>
				<tr>
					<th>Client Name</th>
					<th>Contact No.</th>
					<th>Description</th>
					<th>Date</th>
					<th>Status</th>
					<th>Change Status</th>
					<th></th>
				</tr>
				<u:forEach items="${request}" var="r">
				<u:forEach items="${r.getUsers()}" var="usr">
					<tr>
						<td>${usr.getFname()}  ${usr.getLname()}</td>
						<td>${usr.getCellno()}</td>
				</u:forEach>
						<td>${r.getDescription()}</td>
						<td>${r.getDate()}</td>
						<td >${r.getStatus()}</td>
						<td>
							<form action="reqstatus" method="post">
							<input type="hidden" name="id" value="${r.getRequest_id()}">

								<select id="status" name="status">
								  	<option value="Open">Open</option>
								  	<option value="Attending">Attending</option>
								  	<option value="Rejected">Rejected</option>
								  	<option value="Closed">Closed</option>
								</select>
								
							<input type ="submit" name="requestStatus" value="Save" />
							
							</form>
						</td>
						<td><a href="/feedback?requestId=${r.getRequest_id()}">Send Feedback</a></td>
				
				</u:forEach>
			</table>
		</div>
</body>
</html>