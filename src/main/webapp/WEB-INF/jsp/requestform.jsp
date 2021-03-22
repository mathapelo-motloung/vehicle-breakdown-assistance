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
<style type="text/css">
	#locs{
font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width:100%;
}

#locs td, #locs th{
border: 1px solid #ddd;
  padding: 8px;
}

#locs tr:nth-child(even){background-color: #f2f2f2;}

#locs tr:hover {background-color: #ddd; }

#locs th{
 padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #ff3333;
  color: white;
}

#tablesD{
 padding: 20px;
 margin:0 auto;
}

#searchD{
padding: 20px;
 margin:0 auto;
 
}

.container {
  padding: 20px;
  height:500px;
   width: 1200px;
  resize: both;
  margin:0 auto;
  overflow: auto;
   align-content: center;
}

#user{
padding: 20px;
 margin:0 auto;

}

.hide{

visibility: hidden

}

}
</style>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<div id="user">
		<h4 >You're logged in as ${sessionName}</h4>
		</div>
<div class="container">
<h2>Request form</h2>
<hr>

<div id="tablesD">
<form:form action="addRequest" method="post" modelAttribute="requestform">
		<table id="locs">
		<tr>
			<td class="hide"><input type="hidden" name="mechanic_id" value="<%=request.getParameter("mechanicId")%>"/></td>
			<td class="hide"><input type="hidden" name="status" value="Open"/></td>
		</tr>
		<tr>
			<th><label>Request Description</label></th>
		</tr>
			<tr>
				<td><textarea name="description" id="description" rows="4" cols="135"></textarea></td>
			</tr>
			<tr>
				<td><input type ="submit" name="makerequest" value="submit"></td>
			</tr>
	
		</table>
	</form:form>
	</div>
	</div>
	
	<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>
</body>
</html>