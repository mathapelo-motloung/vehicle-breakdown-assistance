<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.error {
		color: red;
		font-style: italic;
		position:relative;
	}
</style>
</head>
<body>
	<h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" 
          action="/addEmployee" modelAttribute="employee">
             <table>
                
                <tr>
				<td><form:label path="fname">Name</form:label></td>
				<td><form:input path="fname" type ="text" name="fname" /></td>
				<td><form:errors path="fname" class="error" /></td>
			</tr>
			<tr>
				<td><form:label path="lname">Surname</form:label></td>
				<td><form:input path="fname" type ="text" name="lname" /></td>
				<td><form:errors path="lname" cssclass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" type ="email" name="email" /></td>
				<td><form:errors path="email" cssclass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="cellno">Contact no.</form:label></td>
				<td><form:input path="cellno" type ="text" name="cellno" /></td>
				<td><form:errors path="cellno" cssclass="error" /></td>
				
			</tr>
			<tr>
				<td><form:label path="lname" for="roles">Choose a Role:</form:label></td>
				
				<td>
					<form:select path="lname" id="roles" name="user_type">
					  	<form:option value="user">Client</form:option>
					  	<form:option value="mechanic">Mechanic</form:option>
					</form:select>
				</td>
				<td><form:errors path="fname" cssclass="error" /></td>
                <tr>
				<td><form:label path="location">Location</form:label></td>
				<td><form:input path="location"  type="text"  placeholder="Search location"  name="location" /></td>
				<td><form:errors path="location" cssclass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" type ="text" name="username"/></td>
				<td><form:errors path="username" cssclass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" type ="password" name="password"/></td>
				<td><form:errors path="password" cssclass="error" /></td>
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