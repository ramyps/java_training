<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="/css/style.css"%>
</style>
<title>View Page</title>
</head>
<body>


 <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
	<form id="personalinfo" name="personalinfo" action="/BankWebDB/viewInfo" method = "post">

	<table></table>
 	<table>
 	<jsp:useBean id="personInfoSession" class= "com.java.apex.bankdb.beans.PersonalAccount" scope="session" />
 		<caption>Personal Details</caption>
		<tr><td>First Name :</td><td> <jsp:getProperty property="firstName" name="personInfoSession" /></td> </tr>
	<tr><td>Last Name :	</td><td><jsp:getProperty property="lastName" name="personInfoSession" /> </td> </tr>
	<tr><td>	Middle Name :</td><td> <jsp:getProperty property="middleName" name="personInfoSession" /> </td> </tr>
	<tr><td>	Gender : </td><td><jsp:getProperty property="gender" name="personInfoSession" /></td> </tr>
	 	</table>
		
	 	<table>
	
		<caption>Contact Details</caption>		 				
		<tr><td>Address :</td><td> <jsp:getProperty property="address" name="personInfoSession" /></td> </tr>
	<tr><td>City : </td><td><jsp:getProperty property="city" name="personInfoSession" /></td> </tr>
	<tr><td>State :	</td><td><jsp:getProperty property="state" name="personInfoSession" /></td> </tr>
	<tr><td>Country : </td><td><jsp:getProperty property="country" name="personInfoSession" /></td> </tr>
	<tr><td>Phone :	<jsp:getProperty property="mobileNo" name="personInfoSession" /></td> </tr>
		 	 	</table>
		 		
	 	<table>
		<caption> Bank Details </caption>		
		<tr><td>Bank Name :</td><td>  <jsp:getProperty property="bank" name="personInfoSession" /></td></tr>
		<tr><td>Account Number : </td><td><jsp:getProperty property="accountNo" name="personInfoSession"/></td></tr>
		<tr><td>SSN : </td><td><jsp:getProperty property="SSN" name="personInfoSession" /></td></tr>
			
		</table>
			

			
			
			<jsp:include page="_footer.jsp"></jsp:include>
			</form>			 
			
</body>
</html>