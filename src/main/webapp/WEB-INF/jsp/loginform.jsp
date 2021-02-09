
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<script>
	function validate(frm){
		if(frm.login.value == " "){
			alert('Login name is required... ');
			return false;
		}
		if(frm.password.value == " "){
			alert('Password is required... ');
			return false;
		}
		return true;
	}
</script>
</head>
<body>

	<h2>Login</h2>
	<hr>
	<form action="login.do" method="post" onsubmit="return validate(this);">
		<table>
			<tr>
				<td><label>Username</label></td>
				<td><input type ="text" name="username" ></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type ="password" name="password" ></td>
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