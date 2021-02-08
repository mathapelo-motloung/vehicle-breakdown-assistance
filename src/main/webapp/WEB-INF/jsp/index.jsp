<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle Breakdown Assistance</title>
</head>
<body>
	 
   	<jsp:include page="nav.jsp"></jsp:include>
   	

	
	<h3>Home Page</h3>
	<hr>
	<h3>Welcome to the Vehicle Breakdown Assistance System</h3>
    
    
       	<c:choose>
    <c:when test="${!username.isEmpty()}">
        <h3 align="right">You're logged in as ${sessionName} </h3>
    </c:when>
   <c:when test="${username.isEmpty()}">
        <h3 align="right">  </h3>
    </c:when>
	</c:choose>

</body>
</html>