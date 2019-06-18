<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="/css/style.css"%>
</style>
<title>Contact Information Page</title>
</head>

<body>
	<form name ="contactinfomn"  id="contactinfomn" action="/BankWebApp/contactInfo" method ="post">

<h1>Enter Your Personal Details </h1>
	<%
			Object obj = request.getAttribute("errMsg");
			if(obj!=null){
			String error =(String)obj;
			%> 	<h3>Error: <%=error%></h3>
			<%} %>	
	
			<div>
	<label for="address">Address: </label><input type="text" name="address" /> <br> 
		<label for="city">	City: </label><input type="text" name="city" /><br>
			<label for="state">	 State: </label><input type="text" name="state" /> <br> 
			<label for="country">	Country: </label><select name="country">
				<option value=""></option>
				<option value="India">India</option>
				<option value="USA">USA</option>
				<option value="Australia">Australia</option>
				<option value="Europe">Europe</option>
			</select><br>
			<label for=mobileNo>Mobile No:</label> <input type="text" name="mobileNo" /> <br>
			<button>Submit</button>

		
			</div>
			</form>
</body>
</html>