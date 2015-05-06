<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="main.do" method="post">
	<input type="hidden" name="action" value="insertUser">
	<table>
		<tr>
			<th colspan="2">회원가입</th>
		</tr>		
		<tr>
			<th>이름</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<th>나이</th>
			<td><input type="number" name="age"></td>
		</tr>
		<tr>
			<th>성별</th>
			<td><input type="radio" name="gender" value="0">남자
				<input type="radio" name="gender" value="1">여자</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="회원가입">
			<input type="reset" value="취소"></td>
		</tr>
	</table>
	</form>
</body>
</html>