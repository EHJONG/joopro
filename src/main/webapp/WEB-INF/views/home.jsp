<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<html>
<head>
	<title>first</title>
</head>
<body>
	<form action = "login_success" method = "post">
		이름 : <input type = "text" name= "id"><br>
		비밀번호 : <input type="password" name= "pw"><br>
		<button type="submit">확인</button>
	</form>	
</body>

<script>
	alert('환영합니다')
</script>
</html>
