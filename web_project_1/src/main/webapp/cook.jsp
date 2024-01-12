<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
    
<%
// 	Cookie cookie = new Cookie("name","이순신");

// 	cookie.setMaxAge(60*60+20*60); // 쿠키 유지 시간(초 단위)
	
// 	response.addCookie(cookie); // 클라이언트에게 쿠키 전송	
	
	
	String name = request.getParameter("food");
	String sort = request.getParameter("cost");
	String store = request.getParameter("store");
	
	Cookie[] cook = request.getCookies();
	for(Cookie c : cook){
		if(c.getName().equals("food"))
			name = c.getValue()+"-"+name;
		if(c.getName().equals("cost"))
			sort = c.getValue()+"-"+sort;
		if(c.getName().equals("store"))
			store = c.getValue()+"-"+store;
	}
	

	Cookie menuName = new Cookie("food", name);
	
	menuName.setMaxAge(3600);
	
	response.addCookie(menuName);
	
	Cookie menuSort = new Cookie("cost", sort);
	
	menuSort.setMaxAge(3600);
	
	response.addCookie(menuSort);
	
	Cookie menuStore = new Cookie("store", store);
	
	menuStore.setMaxAge(3600);
	
	response.addCookie(menuStore);
	
// 쿠키 삭제
// 	 Cookie[] ck = request.getCookies();
// 		 for( Cookie c : ck ){
// 			  if(c.getName().equals("food")){
// 				c.setMaxAge(0);
// 			  response.addCookie(c);
// 			  break;
// 			  }
// 		 }
	
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="cook_read.jsp">쿠키 확인</a>


</body>
</html>