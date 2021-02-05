<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<table width="400">
	<tr>
	<c:choose>
	  	<c:when test="${user.getUsertype() == 'ROLE_ADMIN'}">
	    	<th><a href="/home">Home</a></th>
			<th><a href="/admin/viewuser">View User</a></th>
			<th><a href="####">View Requests</a></th>
			<th><a href="####">View Feedback</a></th>
			<th><a href="logincontroller.do?action=logout">Logout</a></th>
	  	</c:when>
	  	<c:when test="${user.getUsertype() == 'ROLE_USER'}">
	   	 	<th><a href="/home">Home</a></th>
			<th><a href="/user/searchlocation">Search Location</a></th>
			<th><a href="####">Send Request</a></th>
			<th><a href="####">Send Feedback</a></th>
			<th><a href="logincontroller.do?action=logout">Logout</a></th>
	  	</c:when>
	  	<c:otherwise>
	    	<th><a href="/home">Home</a></th>
	    	<th><a href="####">Send Feedback</a></th>
			<th><a href="logincontroller.do?action=logout">Logout</a></th>
	  	</c:otherwise>
	</c:choose>
	</tr>
</table>
