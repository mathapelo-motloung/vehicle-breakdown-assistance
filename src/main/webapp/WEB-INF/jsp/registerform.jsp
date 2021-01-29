<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Register</h2>
<hr>

	<form action="adduser" method="post">
		<table>
			<tr>
				<td><label>Name</label></td>
				<td><input type ="text" name="fname" required></td>
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
					  	<option value="user">Client</option>
					  	<option value="mechanic">Mechanic</option>
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
			<tr>
				 <td></td> 
				<td><p> Already have an account? <a href="/login">Login here</a></p></td>
			</tr>
	
		</table>
	</form>
	
	
	
</body>
</html>