<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.Request"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Requests</title>
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
  height:550px;
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
<!-- <div id="user">
		<h4 >You're logged in as ${sessionName}</h4>
		</div> -->
<div class="container">
	<h2>My Request(s)</h2>
	<hr>
	
	
	<div style="margin-top: 25px;"></div>
	<div id="tablesD">
	<form action="filterrequest" method="post">
		<div>
			<table id="locs">
				<tr>
					<th>Description</th>
					<th>Date</th>
					<th>Status</th>
					<th>Feedback</th>
				</tr>
				<u:forEach items="${clientRequest}" var="r">
					<tr>
						<td>${r.getDescription()}</td>
						<td>${r.getDate()}</td>
						<td>${r.getStatus()}</td>
						<td><a href="/feedback?requestId=${r.getRequest_id()}">Send Feedback</a></td>
					</tr>
				</u:forEach>
			</table>
		</div>
	</form>
	</div>
	</div>
	<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>
</body>
</html>