<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="/css/style.css"%>
</style>
<title>Personal Information Page</title>
</head>
<body>
	<form id="personalinfo" name="personalinfo" action="/BankWebApp/personInfo" method = "post">
	<%
			Object obj = request.getAttribute("errMsg");
			if(obj!=null){
			String error =(String)obj;
			%> 	<h3>Error: <%=error%></h3>
			<%} %>	
	
<h1>Enter Your Personal Details </h1>
			<div>
			<label for="firstname">First Name: </label> <input type="text"
				name="firstname" /> 
				<br> <label for="middlename">
				Middle Name: </label> <input type="text" name="middlename" />
				<br>
			<label for="lastname"> Last Name: </label> <input type="text"
				name="lastname" /> <br> <label for="gender">
				Gender: </label> <input type="radio" name="gender" value="male" /> Male
				 <input
				type="radio" name="gender" value="female" />Female<br>
			<button>Submit</button>
			</div>
			</form>
</body>
</html>	