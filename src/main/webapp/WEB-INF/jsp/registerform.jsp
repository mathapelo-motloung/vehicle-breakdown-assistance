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

	<form:form action="adduser" method="post" modelAttribute="user" name ="registerForm" onsubmit="return validate()">
		<table>   
            <tr>
				<td><form:label path="fname">Name</form:label></td>
				<td><form:input path="fname" type ="text" name="fname" minlength="2"/></td>
			<tr>
				<td><form:label path="lname">Surname</form:label></td>
				<td><form:input path="lname" type ="text" name="lname" minlength="2"/></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" type ="email" name="email" /></td>
			</tr>
			<tr>
				<td><form:label path="cellno">Contact no.</form:label></td>
				<td><form:input path="cellno" type ="text" name="cellno" id ="contactno"/></td>
			</tr>
			<tr>
				<td><form:label path="usertype" for="roles">Choose a Role:</form:label></td>
				
				<td>
					<form:select path="usertype" id="roles" name="usertype">
					  	<form:option value="ROLE_USER">Client</form:option>
					  	<form:option value="ROLE_MECHANIC">Mechanic</form:option>
					</form:select>
				</td>
                <tr>
				<td><form:label path="location">Location</form:label></td>
				<td><form:select path="location" id="location" name="location">
					  	<form:option value="Johannesburg">Johannesburg</form:option>
					  	<form:option value="Pretoria">Pretoria</form:option>
					  	<form:option value="Sandton">Sandton</form:option>
					  	<form:option value="Midrand">Midrand</form:option>
					  	<form:option value="Soweto">Soweto</form:option>
					  	<form:option value="Vereeniging">Vereeniging</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" type ="text" name="username" minlength="2"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" type ="password" name="password" minlength="5"/></td>
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
	
	<script type = "text/javascript">
  
      function validate() {
    	  var contactno = document.getElementById("contactno").value;
      	
         if( document.registerForm.fname.value == "" ) {
				document.registerForm.fname.focus();
				alert("Please enter your name");
            	return false;
		 }
		 if( document.registerForm.lname.value == "" ) {
				document.registerForm.lname.focus();
				alert("Please enter your surname");
            	return false;
		 }
		 if( document.registerForm.email.value == "" ) {
				document.registerForm.email.focus();
				alert("Please enter your email");
            	return false;
		 }
		 if( document.registerForm.contactno.value == "") {
				document.registerForm.contactno.focus();
				alert("Please enter your contact no.");
            	return false;
		 }
		 if( isNaN(contactno)) {
				document.registerForm.contactno.focus();
				alert("Contactno must be a valid number");
         	return false;
		 }
		 if( document.registerForm.usertype.value == "" ) {
				document.registerForm.usertype.focus();
				alert("Please select role");
            	return false;
         }
		 if( document.registerForm.location.value == "" ) {
				document.registerForm.location.focus();
				alert("Please select location");
         	return false;
      	}
		 if( document.registerForm.username.value == "" ) {
				document.registerForm.username.focus();
				alert("Please select location");
      	return false;
   		}
		 if( document.registerForm.password.value == "" ) {
				document.registerForm.password.focus();
				alert("Please select location");
      	return false;
   		}
         
         return( true );
      }
      
   
</script>

</body>
</html>