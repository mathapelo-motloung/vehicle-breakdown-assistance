<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Home</title>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	



	<section class="showcase">
	
	<div class="w3-container w3-padding-5 w3-center">
	
		<c:choose>
			<c:when test="${!username.isEmpty()}">
				<h1 class="w3-text-shadow w3-animate-opacity">Welcome ${sessionName}</h1>
			</c:when>
			<c:when test="${username.isEmpty()}">
				<h1 align="right"></h1>
				
			</c:when>
		</c:choose>
		<hr>
</div>
	</section>


	<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>

</body>
</html>