<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    <%@page import="java.util.List"%>
    <%@page import="com.zensar.vehiclebreakdown.model.Request"%>
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
<c:set var="id" value="${user.setUser_id(user_id)}"></c:set>
	 <c:out value="${id}"></c:out>

	<c:set var="u_id" value="${user.setUser_id(1)}"></c:set>
	<c:set var="user_id" value="${user.getUser_id()}"></c:set>

<c:set var = "now" value = "<%= new java.util.Date()%>" />
<h5>${u_id}</h5>
      <p>Formatted Date (1): <fmt:formatDate type = "time" 
         value = "${now}" /></p>
      
      <p>Formatted Date (2): <fmt:formatDate type = "date" 
         value = "${now}" /></p>
      
      <p>Formatted Date (3): <fmt:formatDate type = "both" 
         value = "${now}" /></p>
<form action="addRequest" method="post">
		<table>
			<tr>
				<td><label>User Id</label></td>
				<td name="user_id"><input type ="text"  value="${user.getUser_id()}"></td>
			</tr>
			
			<tr>
				<td><label>Description</label></td>
				<td><input type ="text" name="description" ></td>
			</tr>
			<tr>
				<td><label>Date</label></td>
				<td><input type ="date" name="date" value="<fmt:formatDate type = "date"  value = "${now}"/>" /></td>
				<td><fmt:formatDate type = "date"  value = "${now}" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type ="submit" name="makerequest" value="submit"></td>
			</tr>
	
		</table>
	</form>
	
</body>
</html>