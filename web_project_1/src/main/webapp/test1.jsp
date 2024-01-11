<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setAttribute("name", "이병헌");
	session.setAttribute("age", 44);
	application.setAttribute("job", "actor");
%>    
   
	이름 : <%=request.getAttribute("name") %> <br> <%-- 페이지가 처음 실행될때 --%>
	나이 : <%=session.getAttribute("age") %> <br> <%-- 브라우저가 처음 실행될때 --%> 
	직업 : <%=application.getAttribute("job") %> <br><%-- 서버가 처음 실행될때 --%>
   
   
<a href="test2.jsp">이동</a>