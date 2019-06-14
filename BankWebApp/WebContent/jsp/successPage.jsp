<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
html, body {
	width: 100%;
	height: 100%;
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	color: #444;
	background: #f0f0f0;
}h3{
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	font-size: 25px;
    text-align: center;
	color: #D8000C;
}
</style>
<title>Registration Success</title>
</head>
<body>
	<Header>
		<h2><font color="red">Registration Success</font></h2>
	</Header>

 <form>
 		<jsp:useBean id="pinform1" class= "com.javatraining.apex.bean.BankInfoBean" scope="session" />
		<h3>First Name :</h3>
		 <jsp:getProperty property="firstname" name="pinform1" />
		<br /> 
		<h3>Last Name :</h3>	<jsp:getProperty property="lastname" name="pinform1" />
		<br /> 
		<h3>Middle Name :</h3><jsp:getProperty property="middlename" name="pinform1" />
		<br /> 
		<h3>Gender :</h3><jsp:getProperty property="gender" name="pinform1" />
		<br /> 
		 		<jsp:useBean id="pinform2" class= "com.javatraining.apex.bean.BankInfoBean" scope="session" />
		
		<h3>Address :</h3> <jsp:getProperty property="address" name="pinform2" />
		<br /> 
		<h3>City :</h3> <jsp:getProperty property="city" name="pinform2" />
		<br /> 
		<h3>State :</h3>	<jsp:getProperty property="state" name="pinform2" />
		<br /> 
		<h3>Country :</h3><jsp:getProperty property="country" name="pinform2" />
		<br /> 
		<h3>Phone :</h3>	<jsp:getProperty property="phoneno" name="pinform2" />
		<br />
				 		<jsp:useBean id="pinform3" class= "com.javatraining.apex.bean.BankInfoBean" scope="session" />
		
		<h3>Bank Name :</h3> <jsp:getProperty property="bank" name="pinform3" />
		<br />
		<h3>Account Number :</h3> <jsp:getProperty property="accountno" name="pinform3" />
		<br />
		<h3>SSN :</h3> <jsp:getProperty property="ssn" name="pinform3" />
		<br />
	</form>
</body>
</html>