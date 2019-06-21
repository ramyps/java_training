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
<title>View Page</title>
</head>
<body>

		<h1> All Person Details in Database</h1>

 <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
	<form id="personalinfo" name="personalinfo" action="/BankWebDB/viewAllInfo" method = "post">

		  <%
	  Object[] obj = (Object[]) request.getSession().getAttribute("allPerson");
	   		PersonalAccount persons[] =  obj;
	  %>
 <%
	for(PersonalAccount person: persons){
		
	}
 
 %>

 	<jsp:useBean id="personInfoSession" class= "com.java.apex.bankdb.beans.PersonalAccount" scope="session" />
 	<table style="float:left;">





			</form>
						 <jsp:include page="_footer.jsp"></jsp:include>
			
</body>
</html>