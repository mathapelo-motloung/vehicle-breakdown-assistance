<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Request form</h1>
<form action="adduser" method="post">
		<table>
			<tr>
				<td><label>Name</label></td>
				<td><input type ="text" name="fname"></td>
			</tr>
			<tr>
				<td><label>Surname</label></td>
				<td><input type ="text" name="lname" required></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type ="email" name="email" required></td>
			</tr>
			<tr>
				<td><label>Contact no.</label></td>
				<td><input type ="text" name="cellno" required></td>
			</tr>
			<tr>
				<td><label for="roles">Choose a Role:</label></td>
				
				<td>
					<select id="roles" name="user_type">
					  	<option value="user">User</option>
					  	<option value="mechanic">mechanic</option>
					</select>
				</td>
				
			</tr>
			<tr>
				<td><label>Location</label></td>
				<td><input id="searchTextField" type="text"  placeholder="Search location"  name="location" required></td>
			</tr>
			<tr>
				<td><label>Username</label></td>
				<td><input type ="text" name="username" required></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type ="password" name="password" required></td>
			</tr>
			<tr>
				<td></td>
				<td><input type ="submit" name="register" value="submit"></td>
			</tr>
	
		</table>
	</form>
	
</body>
</html>