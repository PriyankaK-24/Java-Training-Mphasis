<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Sign up</h1>
	<center>
	
	<form action = "Register" method ="post">
		Enter FullName : <input type = "text" name = "fname"><br><br>
		
		Enter UserName : <input type = "text" name = "user"><br><br>
		
		Enter Password : <input type = "password" name = "pwd"><br><br>
		
			<input type = "submit" value="signup"><br>
			
			<a href = "login.jsp">Already have an account</a>
	</form>
	</center>
</body>
</html>