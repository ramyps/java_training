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
	<form id="bankinfomn" name="bankinfomn" action="/BankWebApp/bankInfo" method ="post">

<h1>Enter Your Personal Details </h1>
	<%
			Object obj = request.getAttribute("errMsg");
			if(obj!=null){
			String error =(String)obj;
			%> 	<h3>Error: <%=error%></h3>
			<%} %>	
	
			<div>
			<label for="bank">Bank Name:</label> <select name="bank">
			<option value=""></option>
				<option value="Wellsfargo">Wells fargo</option>
				<option value="bofa">Bank of America</option>
				<option value="western">Western Union</option>
				<option value="union">Union Bank</option>
			</select> <br> <label for="accountNo">Account#: </label><input
				type="text" name="accountNo" /><br> <label for="SSN">SSN:
			</label><input type="text" name="SSN" /> <br>
			<br>

			<button>Submit</button>
			</div>
			</form>
</body>
</html>