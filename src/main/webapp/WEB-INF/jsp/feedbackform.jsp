<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table, th, td {
	padding: 10px;
	border: 1px solid black;
	border-collapse: collapse;
}
</style>

</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
	<h2>Feedback</h2>
	<hr>
	<h3 align="right">You're logged in as ${sessionName} </h3>
	
	<br>

	<form:form action="sendfeedback" method="post" modelAttribute="feedback" name ="feedbackForm" onsubmit="return fValidate();">
		<table>
			<tr>
				<td><label>Provide feed back below</label></td>
			</tr>
			<tr>
			<td><input type="hidden" name="request_id" value="<%=request.getParameter("requestId")%>"></td>
		</tr>
			<tr>
				<td><textarea name="description"  id="description"rows="4" cols="50" ></textarea>
				</td>
			</tr>
			<tr>
				<td><input type ="submit" name="sendfeedback" value="submit"></td>
			</tr>
		</table>
	</form:form>
	
	<script type = "text/javascript">
  
      function fValidate() {
         
    	  if(document.getElementById('description').value == '') {
				document.feedbackForm.description.focus();
				alert("Please enter description.");
            	return false;
            	console.log("working");
		 }
         return( true );
     }       
</script>
</body>
</html>