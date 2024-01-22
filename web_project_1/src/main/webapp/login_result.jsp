<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%@ page import="entity.member" %>
    
    
<% 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	boolean isFail=false;
	
	Connection conn = null; // 접속정보
	Statement st=null; // sql질의문 전달
	ResultSet rs=null; // 질의에 대한 결과 받기
	
	try{
		String url = "jdbc:mysql://localhost:3306/beaver";
		String user="beaver";
		String password="123456";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,user,password);
		
		
	}catch(Exception e){
		System.out.println("드라이버 로드 및 데이터베이스 접속 실패 - 로그인");
		e.printStackTrace();
	}
	
	try{ 
//		where - 조건식 만들기 , or and not 기호대신 문자 그대로 써야한다.
// 		String sql="select * form member_model1 where id='"+id+"' and pw='"+pw+"' "; // sql질의문으로 조회
		String sql="select * form member_model1"; // 조건없이 모든걸 가져오기	
		st = conn.createStatement();
		rs = st.executeQuery(sql); // sql문의 결과 값 받기 , Query - 조회하기
		
		while( rs.next() ){
			if( id.equals( rs.getString("id")) ){
				if( pw.equals( rs.getString("pw")) ){
					
					member m = new member(rs.getInt("num") , rs.getString("id") , rs.getString("pw") , rs.getString("email") , rs.getString("tel"));
					
					session.setAttribute( "user" , m );
					response.sendRedirect("/web_project_1/");
					break;
				}
			}
		}
		
	}catch(SQLException e){
		
	}
	
	
	// 아이디 또는 비밀번호가 올바르지 않다면
	if(isFail){
	session.setAttribute("fail", "11123");
	response.sendRedirect("login.jsp?fail=1");
	}

%>

<script>
// 	location.href="login.jsp?fail=1";
	// history.back();

</script>




// 기존 아이디 비교 하는 방법
// 	if( id.equals("blue") ){
// 		if( pw.equals("1234") ){
// 			session.setAttribute("user", "박문수");
// 			response.sendRedirect("index.jsp");
// 		}else{
// 			isFail=true;
// 		}
// 	}else{
// 		isFail=true;
// 	}