<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

<!-- CSS 경로 수정: 상위 폴더 이동 필요 -->
<link rel="stylesheet" type="text/css" href="css/login.css">
<script type="text/javascript" src="script/memberscr.js"></script>

</head>
<body>
<div class="login-container">
    <h2>로그인</h2>

    <form name="frm" action="MemberServlet" method="POST" onsubmit="return loginCheck()">

        <!-- Login Form Action Command -->
        <input type="hidden" name="command" value="fruitHome">

        <div class="input-group">
            <label for="userid">아이디</label>
            <input type="text" id="userid" name="userid" placeholder="아이디를 입력하세요" required>
        </div>

        <div class="input-group">
            <label for="pass">비밀번호</label>
            <input type="password" id="pass" name="pass" placeholder="비밀번호를 입력하세요" required>
        </div>

        <button type="submit" class="login-btn">로그인</button>

    <script type="text/javascript" src="../script/memberscrs.js"></script>

    </form>
    
    

    <div class="links">
        <a href="#">아이디찾기</a> |
        <a href="#">비밀번호찾기</a> |
        <a href="MemberServlet?command=fruitJoin">회원가입</a>
        <!-- FruitServlet 오타 삭제 + MemberServlet 구조에 맞게 수정 -->
    </div>
</div>

<footer>
    <p>COPYRIGHT ⓒ 2025 과일농장 Inc. All Rights Reserved.</p>
</footer>

</body>
</html>