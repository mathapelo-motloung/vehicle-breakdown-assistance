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

}
</style>

</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<div id="user">
		<h4 >You're logged in as ${sessionName}</h4>
		</div>
<div class="container">
	<h2>Feedback</h2>
	<hr>
	
	
	<br>
<div id="tablesD">
	<form:form action="sendfeedback" method="post" modelAttribute="feedback" name ="feedbackForm" onsubmit="return fValidate();">
		<table id="locs">
			<tr>
				<th><label>Provide feed back below</label></th>
			</tr>
			<tr>
			<td><input type="hidden" name="request_id" value="<%=request.getParameter("requestId")%>"></td>
		</tr>
			<tr>
				<td><textarea name="description"  id="description"rows="4" cols="135" ></textarea>
				</td>
			</tr>
			<tr>
				<td><input type ="submit" name="sendfeedback" value="submit"></td>
			</tr>
		</table>
	</form:form>
	</div>
	</div>
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
<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>
</body>
</html>