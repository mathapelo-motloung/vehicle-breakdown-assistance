<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<table width="400">
	<tr>
	<c:choose>
	  	<c:when test="${userSession.getUsertype() == 'ROLE_ADMIN'}">
			<th><a href="/viewuser">View User</a></th>
			<th><a href="/feedback">View Feedback</a></th>
			<th><a href="/login">Logout</a></th>
	  	</c:when>
	  	<c:when test="${userSession.getUsertype() == 'ROLE_USER'}">
			<th><a href="/searchlocation">Search Location</a></th>
			<th><a href="####">Send Request</a></th>
			<th><a href="/feedback">Send Feedback</a></th>
			<th><a href="/login">Logout</a></th>
	  	</c:when>
	  	<c:when test="${userSession.getUsertype() == 'ROLE_MECHANIC'}">
	    	<th><a href="####">Send Feedback</a></th>
			<th><a href="/logout">Logout</a></th>
	  	</c:when>
	  	<c:otherwise>
			<th><a href="/register">Register</a></th>
			<th><a href="/login">Login</a></th>
	  	</c:otherwise>
	</c:choose>
	</tr>
</table>
