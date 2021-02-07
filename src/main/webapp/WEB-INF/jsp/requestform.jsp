<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    <%@page import="java.util.List"%>
    <%@page import="com.zensar.vehiclebreakdown.model.Request"%>
    
    
    <%@page import="com.zensar.vehiclebreakdown.model.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Request form</h1>
<c:set var="name" value="${user.getFname()}"></c:set>
	 <c:out value="${name}"></c:out>

	<c:set var="user_id" value="${user.getUser_id()}"></c:set>


<form:form action="addRequest" method="post" modelAttribute="requestform">
		<table>
			<tr>
				<td><label>User Id</label></td>
				<td><input  name="user_id" type ="text"id="user_id"  value="${user_id}"></td>
			</tr>
			
			<tr>
				<td><label>Description</label></td>
				<td><textarea name="description" type="text" id="description" rows="4" cols="50">
					
				</textarea></td>
				
			</tr>
			<tr>
				<td><label>Date</label></td>
				<td><fmt:formatDate type = "date"  value = "${now}"/>" </td>
				
			</tr>
			<tr>
				<td></td>
				<td><input type ="submit" name="makerequest" value="submit"></td>
			</tr>
	
		</table>
	</form:form>
	
</body>
</html>