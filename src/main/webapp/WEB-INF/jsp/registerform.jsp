<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	.error {
		color: red;
		font-style: italic;
	}
</style>
</head>
<body>
<h2>Register</h2>
<hr>

	<form:form action="adduser" method="post" modelAttribute="user">
		<table>
			<tr>
				<td><form:label path="fname">Name</form:label></td>
				<td><form:input path="fname" type ="text" name="fname" /></td>
				<td><form:errors path="fname" cssclass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="lname">Surname</form:label></td>
				<td><form:input path="lname" type ="text" name="lname" /></td>
			</tr>
			<tr>
				<td><form:label path="lname">Email</form:label></td>
				<td><form:input path="lname" type ="email" name="email" /></td>
			</tr>
			<tr>
				<td><form:label path="lname">Contact no.</form:label></td>
				<td><form:input path="lname" type ="text" name="cellno" /></td>
			</tr>
			<%-- <tr>
				<td><form:label path="lname" for="roles">Choose a Role:</form:label></td>
				
				<td>
					<form:select path="lname" id="roles" name="user_type">
					  	<form:option value="user">Client</form:option>
					  	<form:option value="mechanic">Mechanic</form:option>
					</form:select>
				</td>
				
			</tr> --%>
			<tr>
				<td><form:label path="lname">Location</form:label></td>
				<td><form:input path="lname"  type="text"  placeholder="Search location"  name="location" /></td>
			</tr>
			<tr>
				<td><form:label path="lname">Username</form:label></td>
				<td><form:input path="lname" type ="text" name="username"/></td>
			</tr>
			<tr>
				<td><form:label path="lname">Password</form:label></td>
				<td><form:input path="lname" type ="password" name="password"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type ="submit" name="register" value="submit" /></td>
			</tr>
			<tr>
				 <td></td> 
				<td><p> Already have an account? <a href="/login">Login here</a></p></td>
			</tr>
	 
		</table>
	</form:form>
	
	
	
</body>
</html>