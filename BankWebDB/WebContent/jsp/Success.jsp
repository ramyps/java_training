<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="/css/style.css"%>
</style>
<title>Insert title here</title>
</head>
<body>
<Header>
		<h2><font color="red">Registration Success</font></h2>
	</Header>

 <form>
 		<jsp:useBean id="personInfoSession" class= "com.java.apex.bankdb.beans.PersonalAccount" scope="session" />
		<h3>First Name :</h3>
		 <jsp:getProperty property="firstName" name="personInfoSession" />
		<br /> 
		<h3>Last Name :</h3>	<jsp:getProperty property="lastName" name="personInfoSession" />
		<br /> 
		<h3>Middle Name :</h3><jsp:getProperty property="middleName" name="personInfoSession" />
		<br /> 
		<h3>Gender :</h3><jsp:getProperty property="gender" name="personInfoSession" />
		<br /> 
		 		<jsp:useBean id="contactInfoSession" class= "com.java.apex.bankdb.beans.PersonalAccount" scope="session" />
		
		<h3>Address :</h3> <jsp:getProperty property="address" name="contactInfoSession" />
		<br /> 
		<h3>City :</h3> <jsp:getProperty property="city" name="contactInfoSession" />
		<br /> 
		<h3>State :</h3>	<jsp:getProperty property="state" name="contactInfoSession" />
		<br /> 
		<h3>Country :</h3><jsp:getProperty property="country" name="contactInfoSession" />
		<br /> 
		<h3>Phone :</h3>	<jsp:getProperty property="mobileNo" name="contactInfoSession" />
		<br />
				 		<jsp:useBean id="pinform3" class= "com.java.apex.bankdb.beans.PersonalAccount" scope="session" />
		
		<h3>Bank Name :</h3> <jsp:getProperty property="bank" name="pinform3" />
		<br />
		<h3>Account Number :</h3> <jsp:getProperty property="accountNo" name="pinform3" />
		<br />
		<h3>SSN :</h3> <jsp:getProperty property="ssn" name="pinform3" />
		<br />
	</form>
</body>
</html>