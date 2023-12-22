<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter The Details</h1>
<form action="save" method="post">
Name:<input type="text" name="user_name">
Email:<input type="text" name="user_email">
Age:<input type="number" name="user_age">
Gender: 
Male<input type="radio" name="user_gender" value="male">
FeMale<input type="radio" name="user_gender" value="female">

<button>submit</button>
</form>
</body>
</html>