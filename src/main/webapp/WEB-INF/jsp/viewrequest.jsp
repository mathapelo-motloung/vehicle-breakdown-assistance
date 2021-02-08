<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="java.util.List"%>
    <%@page import="com.zensar.vehiclebreakdown.model.Request"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet"> 
<title>View requests</title>
</head>
<body>


<form action="all" method="get">
	<c:forEach items="${user}" var="p">
		
	</c:forEach>
	<c:forEach items="${requests}" var="p">
	
		<div class="card">
		 
		  <div class="container">
		  
		   <h5>Description: ${p.getDescription()}</h5>
		    <h5>Date: ${p.getDate() }</h5>
		    
		  </div>
		</div>
		
	</c:forEach>
	
</form>
</body>
</html>