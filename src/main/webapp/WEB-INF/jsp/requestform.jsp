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
<jsp:include page="nav.jsp"></jsp:include>
<h2>Request form</h2>
<hr>
<h3 align="right">You're logged in as ${sessionName} </h3>


<form:form action="addRequest" method="post" modelAttribute="requestform">
		<table>
		<tr>
			<td><input type="hidden" name="mechanic_id" value="<%=request.getParameter("mechanicId")%>"></td>
		</tr>
		<tr>
			<td><label>Request Description</label></td>
		</tr>
			<tr>
				<td><textarea name="description" id="description" rows="4" cols="50"></textarea></td>
			</tr>
			<tr>
				<td><input type ="submit" name="makerequest" value="submit"></td>
			</tr>
	
		</table>
	</form:form>
	
</body>
</html>