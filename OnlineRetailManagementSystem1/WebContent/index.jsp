<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Registration</h1>
	<form action="CustomerController" method="POST">
		<input type="hidden" name="source" value="addCustomer" />
		<table>
			<tr>
				<td>Customer Id:</td>
				<td><input type="text" name="cId" /></td>
			</tr>
			<tr>
				<td>Customer Name:</td>
				<td><input type="text" name="cName" /></td>
			</tr>
			<tr>
				<td>Customer Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Customer Password:</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>Customer Phone Number:</td>
				<td><input type="text" name="phoneNumber" /></td>
			</tr>
			<tr>
				<td>Customer Address:</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /> <input type="reset"
					value="Reset" /></td>
			</tr>
		</table>
	</form>
		<p>
		<%
			String errorMsg = (String) request.getAttribute("errorMsg");
			if(errorMsg!=null){
				out.println(errorMsg);
			}
		%>
	</p>
</body>
</html>