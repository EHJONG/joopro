<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<c:forEach items="${list }" var="list">
	<a href="">
	<p>
	<c:out value="${list.name }"></c:out></a>
	<!-- 시간 포맷을 합니다, 쉽게 말해 보기 편하게 설정 하는 것 -->		
	<fmt:formatDate value = "${list.time }" pattern = "yyyy-MM-dd HH:mm:ss"/>
	</p>

</c:forEach>
