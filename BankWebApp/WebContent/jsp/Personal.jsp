<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Personal Information Page</title>
<style type="text/css">
html, body {
	width: 100%;
	height: 100%;
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	color: #444;
	background: #f0f0f0;
}

.container {
	position: fixed;
	width: 380px;
	height: 420px;
	top: 35%;
	left: 50%;
	margin-top: -140px;
	margin-left: -170px;
	background: #fff;
	border-radius: 10px;
	border: 1px solid #ccc;
	box-shadow: 10px 10px grey;
}

form {
	margin: 0 auto;
	margin-top: 20px;
}

label {
	color: #000;
	display: inline-block;
	margin-left: 18px;
	padding-top: 10px;
	font-size: 14px;
}

input {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	font-size: 12px;
	outline: none;
}

input[type=text] {
	color: #000;
	padding-left: 10px;
	margin: 10px;
	margin-top: 12px;
	margin-left: 18px;
	width: 290px;
	height: 35px;
	border: 1px solid #000;
	border-radius: 2px;
	box-shadow: 3px 3px grey;
}

h2 {
    background: #ecf2f5;
    width: 380px;
    height: 35px;
    padding: 15px 0px 5px 0px;
    font-size: 25px;
    text-align: center;
    margin-top: 0px;   
    margin-bottom: 10px;
    border-bottom: 1px solid #ccc;
    border-top: 1px solid #ccc;
    border-bottom-right-radius: 3px;
    border-bottom-left-radius: 3px;
    border-radius: 10px 10px 0px 0px;
	float: right;
	
}



button {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	float: right;
	margin-right: 20px;
	margin-top: 20px;
	width: 80px;
	height: 30px;
	font-size: 14px;
	font-weight: bold;
	color: #000;
	background-color: #acd6ef;
	border-radius: 10px;
	border: 1px solid #66add6;
	cursor: pointer;
	box-shadow: 3px 3px grey;
}
h3{
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	font-size: 25px;
    text-align: center;
	color: #D8000C;
}</style>
</head>
<body>
	<%
			Object obj = request.getAttribute("errMsg");
			if(obj!=null){
			String error =(String)obj;
			%> 
		
	<form id="personalinfo" name="personalinfo" action="/BankWebApp/pInfo" method = "post">
		<h3>Error: <%=error%></h3>
			<%} %>	
	
		<div class="container">

			<h2>Enter your Personal details</h2>

			<label for="firstname">First Name: </label> <input type="text"
				name="firstname" /> <br> <label for="middlename">
				Middle Name: </label> <input type="text" name="middlename" /><br>
			<label for="lastname"> Last Name: </label> <input type="text"
				name="lastname" /> <br> <label for="gender">
				Gender: </label> <input type="radio" name="gender" value="male" /> Male <input
				type="radio" name="gender" value="female" />Female<br>
			<button>Submit</button>
				

		</div>

	</form>
</body>
</html>