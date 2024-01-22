<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	String part = "main";
	if( request.getAttribute("part") != null ){
		part = (String)request.getAttribute("part");
	}
%>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>애플반</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.2/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="./static/css/default.css">
<script src="./static/js/init.js"></script>

<%-- part 파라미터의 유무에 따라 추가 css,js --%>

<link rel="stylesheet" href="./static/css/<%=part %>.css">
<script src="./static/js/<%=part %>.js"></script>



</head>
<body>

	<div id="wrap">
		
		
		<%@ include file="header.jsp" %>
		
		<div id="main">
			<% pageContext.include(part+".jsp"); %>
		</div>
		
		
		<%@ include file="footer.jsp" %>
	</div>


</body>
</html>






<!-- 
	회원가입 - 로그인
	게시판 - 목록, 글쓰기, 수정, 삭제, 댓글

	jstl - jsp standard tag library
	
	core - 변수, 조건문, 반복문
	
	formatting - 날짜, 시간, 숫자, 통화단위, 텍스트 등을 표시하는 방법
	
	
	
	
 -->