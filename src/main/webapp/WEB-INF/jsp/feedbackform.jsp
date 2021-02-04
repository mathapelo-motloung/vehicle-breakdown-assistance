<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Feedback</h2>
	<hr>
	<form action="sendfeedback" method="post">
		<table>
			<tr>
				<td><label>Provide feed back below</label></td>
			</tr>
			<tr>
					<td>user Id</td>
			</tr>
			<c:forEach items="${user}" var="user">
			<tr>
				<td>${user.getUser_id()}</td>
				<%-- <td><a href="contactcontroller.do?action=delete&id=${p.getId()}​​">delete</a></td> --%>
			</tr>
			</c:forEach>
			
			
			
			
			
			<tr>
				<input type="hidden" name="user_id" value="3487">
			</tr>
			<tr>
				<td><textarea name="description" type="text" rows="4" cols="50">
					
				</textarea></td>
			</tr>
			<tr>
				<td><input type ="submit" name="login" value="submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>