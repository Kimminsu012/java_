<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${fail != null }">
	<script> alert("아이디 또는 비밀번호가 잘 못 되었습니다.")</script>
</c:if>

<!-- <script> -->
<!-- // 	var pre = document.referrer; // 이전페이지 주소 가져오기 -->
<!-- // 	alert(pre); -->
<!-- </script> -->



<div id="signin_wrap">
	<form id="signFm" method="post" action="/members/signExcute">
		<input type="hidden" name="cmd" id="cmd" value="dao">
		
		<div id="login_wrap">
			<div class="login_input">
				<input type="email" name="email" id="email" placeholder="아이디">
			</div>
			<div class="login_input">
				<input type="password" name="pin" id="pin" placeholder="비밀번호">
			</div>
			<div class="login_bt">
				<a href="javascript:login()">Login</a>
			</div>
			<div class="find_sign">
				<a href="/members/forget">아이디/비밀번호찾기</a>
				<a href="/members/signup">회원가입</a>
			</div>
		</div>
	</form>
</div>
