<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" style="text-align: center;">
		<tr>
			<th>이름</th>
			<th>email</th>
			<th>나이</th>
			<th>성별</th>
		</tr>
		<c:forEach items="${list}" var="u">
		<tr>
			<td>${u.name}</td>
			<td>${u.email}</td>
			<td>${u.age}</td>
			<td><c:if test="${u.gender eq 0}">남자</c:if>
				<c:if test="${u.gender eq 1}">여자</c:if></td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="4"><a href="signup.jsp">회원등록</a></td>
		</tr>
	</table>
	
</body>
</html>