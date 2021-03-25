<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
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

#searchD{
padding: 20px;
 margin:0 auto;
 
}

.container {
  padding: 20px;
  height:1000px;
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
<h2>View Users</h2>  
<hr>


<br>

	 <div id = "searchD">
	<form action="filteruser" method="post">
		<div>
			<tr>
				<td><label>Filter Users</label></td>
				<td><select id="roles" name="user_type">
						<option value="ROLE_USER">User</option>
						<option value="ROLE_MECHANIC">Mechanic</option>
						<option value="all">All</option>
				</select></td>
			</tr>
			<tr>
				
				<td><input type="submit" name="filter" value="submit"></td>
			</tr>
		</div>
	</form>
</div>
	<div style="margin-top: 25px;"></div>

	<div id="tablesD">
		<div>
			<table id="locs">
				<tr>
					<th>user Id</th>
					<th>Name</th>
					<th>Surname</th>
					<th>Email Address</th>
					<th>User Type</th>
					<th>Cell Number</th>
					<th>Location</th>
					<th>Username</th>
					<th>Password</th>
					<th>Status</th>
					<th>Enable/Disable</th>
				</tr>

				<u:forEach items="${user}" var="p">
				<tr>
					<form action="block" method="post">
						
						<td>${p.getUser_id()}<input type="hidden" name="id"
							value="${p.getUser_id()}" /></td>
						<td>${p.getFname()}<input type="hidden" name="fname"
							value="${p.getFname()}" /></td>
						<td>${p.getLname()}</td>
						<td>${p.getEmail()}</td>
						<td>${p.getUsertype()}</td>
						<td>${p.getCellno()}</td>
						<td>${p.getLocation()}</td>
						<td>${p.getUsername()}</td>
						<td>${p.getPassword()}</td>
						<td>${p.getStatus()}</td>
						<td>
						<u:if test="${p.getStatus().equals('BLOCKED')}">
								<input type="submit" name="status"
									value="Unblock" />
							</u:if> 
							<u:if test="${p.getStatus().equals('NOT BLOCKED')}">
								<input type="submit" name="status"
									value="Block" />	
						</u:if>
						</td>
					
					</form>
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