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
 <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
	<form id="personalinfo" name="personalinfo" action="/BankWebDB/personInfo" method = "post">
	<%
			Object obj = request.getAttribute("errMsg");
			if(obj!=null){
			String error =(String)obj;
			%> 	<h3>Error: <%=error%></h3>
			<%} %>	
	
<h1>Enter Your Personal Details </h1>
			<div>
			<label for="firstName">First Name: </label> <input type="text"
				name="firstName" /> 
				<br> <label for="middleName">
				Middle Name: </label> <input type="text" name="middleName" />
				<br>
			<label for="lastName"> Last Name: </label> <input type="text"
				name="lastName" /> <br> <label for="gender">
				Gender: </label> <input type="radio" name="gender" value="male" /> Male
				 <input
				type="radio" name="gender" value="female" />Female<br>
			<button>Submit</button>
			</div>      <jsp:include page="_footer.jsp"></jsp:include>
			
			</form>
</body>
</html>	