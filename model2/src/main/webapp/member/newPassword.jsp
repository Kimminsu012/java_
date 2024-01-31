<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<form method="post" action="/members/restPassword">
	<input type="hidden" name="email" value="${email }">
	<input type="password" name="pin" placeholder="새 비밀번호">
	<br>
	<input type="password" placeholder="새 비밀번호 확인">
	<button>변경</button>
</form>