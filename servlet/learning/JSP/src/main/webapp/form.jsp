<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User registration</title>
</head>
<body>
	<form action="FormServlet" method="post">
		name : <input type="text" name="name"><br>
		gender :<br>
			male <input type="radio" name="gender" value="0"><br>
			female <input type="radio" name="gender" value="1"><br>
		<input type="submit" value="regist"><br>
	</form>
</body>
</html>