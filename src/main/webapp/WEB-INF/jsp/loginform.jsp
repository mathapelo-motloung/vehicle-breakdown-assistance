
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Login</h2>

	<hr>
	<form action="login" method="post">
		<table>
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
				<td><input type ="submit" name="login" value="submit"></td>
			</tr>
			<tr>
				 <td></td> 
				<td><p> New user? <a href="/register">Register here</a></p></td>
			</tr>
		</table>

	</form>
</body>
</html>