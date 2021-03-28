<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Register</title>

<style>
.error {
	color: red;
	font-style: italic;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}
div{
 padding: 20px;
 margin:0 auto;
}

.container {
	padding: 20px;
	background-color: white;
	width: 500px;
	resize: both;
	margin: 0 auto;
	overflow: auto;
	border: 3px solid #f1f1f1;
	align-content: center;
}

input{
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

.registerbtn {
	background-color: red;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

.registerbtn:hover {
	opacity: 1;
}

a {
	color: dodgerblue;
}

.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>


</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

<div>
	<form:form action="adduser" method="post" modelAttribute="user"
		name="registerForm" onsubmit="return validate()">
		

		<div class="container">
			<h2>Register</h2>
			<p>Please fill in this form to create an account.</p>
			<hr>

			<form:label path="fname">
				<b>Name</b>
			</form:label>
			<form:input path="fname" type="text"
				name="fname" minlength="2" />

			<form:label path="lname">
				<b>Surname</b>
			</form:label>
			<form:input path="lname"  type="text"
				name="lname" minlength="2" />

			<form:label path="email">
				<b>Email</b>
			</form:label>
			<form:input path="email"  type="email"
				name="email" />
			<br>
			<br>
			<form:input path="status" type="hidden" name="status"
				value="NOT BLOCKED" />

			<form:label path="cellno">
				<b>Contact no.</b>
			</form:label>
			<form:input path="cellno"  type="text"
				name="cellno" id="contactno" />

			<form:label path="usertype" for="roles">
				<b>Choose a Role:</b>
			</form:label>
			<form:select path="usertype" id="roles" name="usertype" >
				<form:option value="ROLE_USER">Client</form:option>
				<form:option value="ROLE_MECHANIC">Mechanic</form:option>
			</form:select>

			<form:label path="location">
				<b>Location</b>
			</form:label>
			<form:select path="location" id="location" name="location">
				<form:option value="Johannesburg">Johannesburg</form:option>
				<form:option value="Pretoria">Pretoria</form:option>
				<form:option value="Sandton">Sandton</form:option>
				<form:option value="Midrand">Midrand</form:option>
				<form:option value="Soweto">Soweto</form:option>
				<form:option value="Vereeniging">Vereeniging</form:option>
			</form:select>
<br>
			<br>
			<form:label path="username">
				<b>Username</b>
			</form:label>
			<form:input path="username"  type="text"
				name="username" minlength="2" />

			<form:label path="password">
				<b>Password</b>
			</form:label>
			<form:input path="password" 
				type="password" name="password" minlength="5" />

			<button type="submit" class="registerbtn" name="register">Register</button>

		</div>
		<div class="container signin">
			<p>
				Already have an account? <a href="/login">Login here</a>.
			</p>
		</div>

	</form:form>
</div>


	<script type="text/javascript">
		function validate() {
			var contactno = document.getElementById("contactno").value;

			if (document.registerForm.fname.value == "") {
				document.registerForm.fname.focus();
				alert("Please enter your name");
				return false;
			}
			if (document.registerForm.lname.value == "") {
				document.registerForm.lname.focus();
				alert("Please enter your surname");
				return false;
			}
			if (document.registerForm.email.value == "") {
				document.registerForm.email.focus();
				alert("Please enter your email");
				return false;
			}
			if (document.registerForm.contactno.value == "") {
				document.registerForm.contactno.focus();
				alert("Please enter your contact no.");
				return false;
			}
			if (isNaN(contactno)) {
				document.registerForm.contactno.focus();
				alert("Contactno must be a valid number");
				return false;
			}
			if (document.registerForm.usertype.value == "") {
				document.registerForm.usertype.focus();
				alert("Please select role");
				return false;
			}
			if (document.registerForm.location.value == "") {
				document.registerForm.location.focus();
				alert("Please select location");
				return false;
			}
			if (document.registerForm.username.value == "") {
				document.registerForm.username.focus();
				alert("Please select location");
				return false;
			}
			if (document.registerForm.password.value == "") {
				document.registerForm.password.focus();
				alert("Please select location");
				return false;
			}

			return (true);
		}
	</script>
	<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>

</body>
</html>