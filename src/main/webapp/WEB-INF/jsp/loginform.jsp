
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}


input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  background: #f1f1f1;
}

button {
  background-color: red;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

button:hover {
  opacity: 0.8;
}
div{
 padding: 20px;
 margin:0 auto;
}

.container {
  padding: 20px;
   width: 500px;
  resize: both;
  margin:0 auto;
  overflow: auto;
  border: 3px solid #f1f1f1;
   align-content: center;
}

span.user {
  float: right;
  padding-top: 16px;
}

@media screen and (max-width: 300px) {
  span.user {
     display: block;
     float: none;
  }
  
 
  }
</style>
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
<jsp:include page="nav.jsp"></jsp:include>
	
	<div>
	<form action="login.do" method="post" onsubmit="return validate(this);">
	
		<div class="container">
		<h2>Login</h2>
	<hr>
		
		<label><b>Username</b></label>
		<input type ="text"  name="username" >
		
		<label><b>Password</b></label>
		<input type ="password"  name="password" >
		
		<button type="submit" name="login" >Login</button>
			</div>
			
			<div class="container" style="background-color:#f1f1f1">
			<span class="user">New user? <a href="/register">Register here</a></span>
			</div>


	</form>
	</div>
	
	<!-- FOOTER  -->
	<footer class="w3-black w3-padding-xlarge w3-center">

		<p>Vehicle Breakdown Assistance &copy; 2021</p>
	</footer>
</body>
</html>