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
<title>Insert title here</title>
<style>
#requestD{
font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width:100%;
}

#requestD td, #requestD th{
border: 1px solid #ddd;
  padding: 8px;
}

#requestD tr:nth-child(even){background-color: #f2f2f2;}

#requestD tr:hover {background-color: #ddd; }

#requestD th{
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
	<h2>View Request</h2>
	<hr>
	
	<div style="margin-top: 25px;"></div>
	
		<div id="tablesD">
			<table id="requestD">
				<tr>
					<th>Client Name</th>
					<th>Contact No.</th>
					<th>Description</th>
					<th>Date</th>
					<th>Status</th>
					<th>Change Status</th>
					<th></th>
				</tr>
				<u:forEach items="${request}" var="r">
				<u:forEach items="${r.getUsers()}" var="usr">
					<tr>
						<td>${usr.getFname()}  ${usr.getLname()}</td>
						<td>${usr.getCellno()}</td>
				</u:forEach>
						<td>${r.getDescription()}</td>
						<td>${r.getDate()}</td>
						<td >${r.getStatus()}</td>
						<td>
							<form action="reqstatus" method="post">
							<input type="hidden" name="id" value="${r.getRequest_id()}">

								<select id="status" name="status">
								  	<option value="Open">Open</option>
								  	<option value="Attending">Attending</option>
								  	<option value="Rejected">Rejected</option>
								  	<option value="Closed">Closed</option>
								</select>
								
							<input type ="submit" name="requestStatus" value="Save" />
							
							</form>
						</td>
						<td><a href="/feedback?requestId=${r.getRequest_id()}">Send Feedback</a></td>
				
				</u:forEach>
			</table>
		</div>
		</div>
		
		<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>
</body>
</html>