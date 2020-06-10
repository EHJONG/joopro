<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <form action = "login_success" method = "post">
		이름 : <input type = "text" name= "id"> ${msg }<br>
		비밀번호 : <input type="password" name= "pw">${not_found_pw }<br> 
		<button type="submit">확인</button>
	</form>