<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>검색</title>
</head>

<body>
	<c:if test="${login != null }">
		${login }님 로그인 하셨습니다.
	</c:if>

	<form action="/customer/search" method="get">
		<h2>손님 검색 :</h2>
		<input type="text" name="name">
		<button>확인</button> ${not_exist_name }
	</form>
	<br>
	<br>
	<br>
	<form action="/customer/register" method="post">
		<h2>손님 등록 :</h2>
		<input type="text" name="name">
	</form>


</body>
</html>