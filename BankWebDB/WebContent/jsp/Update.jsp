<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="/css/style.css"%>
</style>
<title>Update Page</title>
</head>
<body>


 <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
	<form id="personalinfo" name="personalinfo" action="/BankWebDB/updateInfo" method = "post">			

<h1>Enter Your SSN Details to Update</h1>
			<div>
			<label for="SSN">SSN: </label> 
			<input type="text" name="SSN" /> 
				<button>Submit</button>
			</div>     
			 <jsp:include page="_footer.jsp"></jsp:include>
			</form>
</body>
</html>