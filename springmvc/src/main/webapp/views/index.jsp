<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME AKASH</h1>
	<form action="addAlien" method="post">
		<!-- IMPORT BOOK -->
		Enter your id: <input type="text" name="aid"> <br> Enter
		your name: <input type="text" name="aname"> <br> <input
			type="submit">
	</form>
	<hr>
	<form action="getAlien" method="get">
		Enter your id: <input type="text" name="aid"> <br> <br> 
		<input type="submit">
	</form>
</body>
</html>