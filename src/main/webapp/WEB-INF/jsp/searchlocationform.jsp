<%@page import="java.util.List"%>
<%@page import="com.zensar.vehiclebreakdown.model.User"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
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
<script>
	function validate(frm) {
		if (frm.id.value == "") {
			alert("Id is required...");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
		<jsp:include page="nav.jsp"></jsp:include>
		<!-- <div id="user">
		<h4 >You're logged in as ${sessionName}</h4>
		</div> -->
		
		<div class="container">
	<h2>Search for Mechanics</h2>
	<hr>
	

	<br>


<div id = "searchD">
	<form action="filtersearch" method="post"
		onsubmit="return validate(this);">
<div>

<tr>
<td><label>Search Location</label></td>
<td><select id="loaction" name="location">
<option value="Johannesburg">Johannesburg</option>
						<option value="Pretoria">Pretoria</option>
						<option value="Sandton">Sandton</option>
						<option value="Midrand">Midrand</option>
						<option value="Soweto">Soweto</option>
						<option value="Vereeniging">Vereeniging</option>
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
	<form action="filtersearch" method="post">
		<div>
			<table id="locs">
				<tr>
					<th>Name</th>
					<th>Surname</th>
					<th>Email Address</th>
					<th>Cell Number</th>
					<th>Location</th>
					<th>Username</th>	
					<th></th>	
				</tr>
				<u:forEach items="${user}" var="p">
					<tr>
						<td>${p.getFname()}</td>
						<td>${p.getLname()}</td>
						<td>${p.getEmail()}</td>
						<td>${p.getCellno()}</td>
						<td>${p.getLocation()}</td>
						<td>${p.getUsername()}</td>
						<td><a href="/makerequest?mechanicId=${p.getUser_id()}">Send Request</a></td>
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