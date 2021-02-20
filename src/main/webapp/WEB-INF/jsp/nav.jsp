
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="css/style.css">

<title>Vehicle Breakdown Assistance</title>
</head>
<body>
	
</body>
</html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<nav class="w3-bar w3-black">
<span class="branding w3-bar-item w3-mobile">Vehicle Breakdown Assistance</span>
<span class="w3-right w3-mobile">
<c:choose>
	  	<c:when test="${userSession.getUsertype() == 'ROLE_ADMIN'}">
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/viewuser">View User</a>
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/feedback/all">View Feedback</a>
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/logout">Logout</a>
	  	</c:when>
	  	<c:when test="${userSession.getUsertype() == 'ROLE_USER'}">
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/searchlocation">Find Mechanic</a>
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/myrequest">My Request</a>
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/logout">Logout</a>
	  	</c:when>
	  	<c:when test="${userSession.getUsertype() == 'ROLE_MECHANIC'}">
	    	<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/filterrequest">View Requests</a>
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/logout">Logout</a>
	  	</c:when>
	  	<c:otherwise>
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/register">Register</a>
			<a class="w3-bar-item w3-button w3-mobile w3-hover-red" href="/login">Login</a>
	  	</c:otherwise>
	</c:choose>
  </span>
</nav>






