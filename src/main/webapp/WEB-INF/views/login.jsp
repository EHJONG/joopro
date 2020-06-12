<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>로그인</title>
</head>
<body>
	<form action="login_success" method="post" >
		<div>이름 : <input type="text" name="id"> ${msg }</div>
		<div>비밀번호 : <input	type="password" name="pw">${not_found_pw }</div> <br>
		<button type="submit">확인</button>
	</form>	
</body>
</html>