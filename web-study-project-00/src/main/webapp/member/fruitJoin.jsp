<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<div class="login-container">
		<h2>회원가입</h2>
		'*'표시 항목은 필수 입력 항목입니다.
		<form action="MemberServlet?command=fruitJoin" method="POST">
			<div class="input-group">
				<table>

					<tr>
						<td>이름</td>
						<td><input type="text" name="name" size="20">*</td>
					</tr>
					
					<tr>
						<td>아이디</td>
						<td><input type="text" name="userid" size="20">* <input
							type="submit" name="command" value="idCheck"></td>
					</tr>
										<c:if test="${result == 1}">
						<span style="color: red;"> 이미 사용중인 아이디입니다.</span>
					</c:if>
					
					<c:if test="${result == -1}">
						<span style="color: red;"> 사용 가능한 아이디입니다.</span>
					</c:if>


					<tr>
						<td>암 호</td>
						<td><input type="password" name="pass" size="20">*</td>
					</tr>

					<tr>
						<td>닉네임</td>
						<td><input type="text" name="nick" size="20">*</td>
					</tr>
					
					<tr>
						<td>전화번호</td>
						<td><input type="text" name="phone" size="20">*</td>
					</tr>
					
					<tr>
						<td>email</td>
						<td><input type="text" name="email" size="20">*</td>
					</tr>
					
					<tr>
						<td>주 소</td>
						<td><input type="text" name="address" size="20">*</td>
					</tr>

				</table>
				<div class="links">
					<input type="submit" value="확인"> <input type="reset"
						value="취소">
				</div>
			</div>
		</form>
	</div>
</body>
</html>