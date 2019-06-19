<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.java.apex.bankdb.beans.PersonalAccount"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="/css/style.css"%>
</style>
</head>
<body>
<Header>
	</Header>

 <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
	<form id="personalinfo" name="personalinfo" action="/BankWebDB/updateDetailsInfo" method = "post">
	 	<jsp:useBean id="personInfoSession" class= "com.java.apex.bankdb.beans.PersonalAccount" scope="request" />
	
	

		<%
		PersonalAccount person = (PersonalAccount) request.getAttribute("personInfoSession");
 		%>

 	<table>
 		<caption>Personal Details</caption>
		<tr><td>First Name :</td>
		<td> <input type="text" name="firstName" maxlength="30" value= "<%=person.getFirstName()%>" /></td> </tr>
	<tr><td>Last Name :	</td>
	<td> <input type="text" name="lastName" maxlength="30" value= "<%=person.getLastName()%>" /></td> </tr>
	<tr><td>	Middle Name :</td>
	<td> <input type="text" name="middleName" maxlength="20" value= "<%=person.getMiddleName()%>" /></td> </tr>
	<tr><td>	Gender : </td>
	<td> <input type="text" name="gender" maxlength="6" value= "<%=person.getGender()%>" /></td> </tr>
	 	</table>
		
	 	<table>
	
		<caption>Contact Details</caption>		 				
		<tr><td>Address :</td>
		<td>  <input type="text" name="address" maxlength="60" value= "<%=person.getAddress()%>" /></td> </tr>
	<tr><td>City : </td>
	<td> <input type="text" name="city" maxlength="20" value= "<%=person.getCity()%>" /></td> </tr>
	<tr><td>State :	</td>
	<td> <input type="text" name="state" maxlength="20" value= "<%=person.getState()%>" /></tr>
	<tr><td>Country : </td>
	<td> <input type="text" name="country" maxlength="20" value= "<%=person.getCountry()%>" /> </tr>
	<tr><td>Mobile No :	</td>
	<td> <input type="text" name="mobileNo" maxlength="10" value= "<%=person.getMobileNo()%>" /></tr>
		 	 	</table>
		 		
	 	<table>
		<caption> Bank Details </caption>		
		<tr><td>Bank Name :</td>
		<td>  <input type="text" name="bank" maxlength="20" value= "<%=person.getBank()%>" /></td></tr>
		<tr><td>Account No : </td>
		<td> <input type="text" name="accountNo" maxlength="12" value= "<%=person.getAccountNo()%>" /></td></tr>
		<tr><td>SSN : </td>
		<td><input type="text" name="SSN" maxlength="12" value= "<%=person.getSSN()%>" readonly/></td></tr>
			
		</table>
			<button>Submit</button>
		
			 <jsp:include page="_footer.jsp"></jsp:include>
			</form>
</body>
</html>