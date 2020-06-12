<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<title></title>
	</head>

	<body>
		<form action = "/customer/search" method = "post">
			<h2>손님 검색 : </h2> <input type = "text" name = "search">
			<button>확인</button> 
		</form>
		<br>
		<br>
		<br>
		<br>
		<form action = "/customer/register" method = "post">
			<h2>손님 등록  :</h2> <input type = "text" name = "name"> 
		</form>
	</body>
</html>