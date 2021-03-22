<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.Feedback"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>


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

</style>

</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<div id="user">
		<h4 >You're logged in as ${sessionName}</h4>
		</div>
<div class="container">
	<h2>View Feedback</h2>
	<hr>
	
	<br>
	
	<div id="tablesD">
		<div>
		
			
			<table id="locs">
				<tr>
					<th>Name</th>
					<th>Surname</th>
					<th>Type</th>
					<th>Feedback Description</th>
					<th>Date and Time</th>
				</tr>
				<u:forEach items="${feedback}" var="f">
					<tr>
						<td>${f.getUser().getFname()}</td>
						<td>${f.getUser().getLname()}</td>
						<td>${f.getUser().getUsertype()}</td>
						<td>${f.getDescription()}</td>
						<td>${f.getDate()}</td>
					</tr>
				</u:forEach>
			</table>
		</div>
		</div>
		</div>
		<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>
</body>
</html>