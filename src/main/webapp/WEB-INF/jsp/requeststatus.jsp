<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Status</title>
</head>
<body>
	<form action="reqstatus" method="post">
		<table>
			<tr>
			<td><input type="hidden" name="id" value="<%=request.getParameter("requestId")%>"></td>
			</tr>
			<tr>
				<td>
					<select  id="status" name="status">
					  	<option value="Open">Open</option>
					  	<option value="Attending">Attending</option>
					  	<option value="Rejected">Rejected</option>
					  	<option value="Closed">Closed</option>
					</select>
				</td> 
			</tr>
			<tr>
				<td>
					<input type ="submit" name="requestStatus" value="submit" />
				</td> 
			</tr>
		</table>
	</form>
</body>
</html>