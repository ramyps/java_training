<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
  <%@include file="/css/style.css"%>
</style>
<title>Success Page</title>
</head>
<body> <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>


 <form><%	String varFirstName = (String) request.getSession().getAttribute("SSN");
			%>	
	
	<h1>	<%if (varFirstName != null){%>
	Hi  <%=varFirstName%></h1>	
<%}%>
<h3>Deleted Successfully</h3>
</form>		<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>
