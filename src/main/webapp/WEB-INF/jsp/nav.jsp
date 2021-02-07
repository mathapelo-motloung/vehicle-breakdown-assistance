
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="css/style.css">
<body>




</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="w3-bar w3-black">
	<span class="w3-bar-item w3-bar-item w3-mobile">Vehicle Breakdown Assistance</span> <span
		class="w3-right w3-mobile" > <c:choose>
			<c:when test="${user.getUsertype() == 'ROLE_ADMIN'}">
				<a href="/home" class="w3-button w3-bar-item w3-mobile  w3-hover-red">Home</a>
				<a href="####" class="w3-button w3-bar-item w3-hover-red">View
					User</a>
				<a href="####" class="w3-button w3-bar-item">View Requests</a>
				<a href="####" class="w3-button w3-bar-item">View Feedback</a>
				<a href="logincontroller.do?action=logout"
					class="w3-button w3-bar-item">Logout</a>
			</c:when>
			<c:when test="${user.getUsertype() == 'ROLE_USER'}">
				<a href="/home" class="w3-button w3-bar-item">Home</a>
				<a href="/user/searchlocation" class="w3-button w3-bar-item">Search
					Location</a>
				<a href="####" class="w3-button w3-bar-item">Send Request</a>
				<a href="####" class="w3-button w3-bar-item">Send Feedback</a>
				<a href="logincontroller.do?action=logout"
					class="w3-button w3-bar-item">Logout</a>
			</c:when>
			<c:otherwise>
				<a href="/home" class="w3-button w3-bar-item">Home</a>
				<a href="####" class="w3-button w3-bar-item">Send Feedback</a>
				<a href="logincontroller.do?action=logout"
					class="w3-button w3-bar-item">Logout</a>
			</c:otherwise>
		</c:choose>
	</span>
</nav>
