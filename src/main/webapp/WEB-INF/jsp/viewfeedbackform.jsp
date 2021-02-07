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
		<div>
			<table>
				<tr>
					<td>Feedback Id:</td>
					<td>User Id:</td>
					<td>Description:</td>
					<td>Date:</td>
				</tr>
				<u:forEach items="${feedback}" var="f">
					<tr>
						<td>${f.getFeedbackId()}<input type="hidden" name="feedback_id"
							value="${f.getFeedbackId()}" /></td>
						<td>${f.getUserId()}<input type="hidden" name="user_id"
							value="${f.getUserId()}" /></td>
						<td>${f.getDescription()}</td><td>${f.getDescription()}</td>
						<td>${f.getDate()}</td><td>${f.getDate()}</td>
					</tr>
				</u:forEach>
			</table>
		</div>
	</form>
</body>
</html>