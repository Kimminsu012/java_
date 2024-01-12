<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	#box{
		width:300px; margin:0 auto;
	}
	.input{
		display:flex; gap:10px;
		flex-wrap:wrap;
	}
	.input input:nth-child(1), .input input:nth-child(2){
		width:120px;
	}
	.input input:nth-child(3){
		width:205px;
	}
	
</style>




</head>
<body>

<%
	int cnt = 0;
	String count = request.getParameter("count");
	if( !(count == null || count.length() == 0) )
		cnt = Integer.parseInt(count) + 1;
		
%>

<div id="box">
	<form method='get' action='cook.jsp'>
		<input type='hidden' name='cnt' value='<%=cnt %>'>
		<div class="input">
			<input type='text' name='food' id='food' placeholder='점심메뉴'>
			<input type='text' name='cost' id='cost' placeholder='가격'>
			<input type='text' name='store' id='store' placeholder='가게이름'>
			<button id='bt'>등록</button>
		</div>
	</form>
</div>


<h2> 점심 메뉴 추천 </h2>

<%
	Cookie[] cook = request.getCookies();


	String food = "" ,cost="",store="";
	
	for( int i=0; i<cook.length; i++){
		if(cook[i].getName().equals("food"))
			food = cook[i].getValue();
		if(cook[i].getName().equals("cost"))
			cost = cook[i].getValue();
		if(cook[i].getName().equals("store"))
			store = cook[i].getValue();
	}
	
	
	String[] foodList = food.split("-");
	String[] costList = cost.split("-");
	String[] storeList = store.split("-");
	
	for(int i=0; i<foodList.length; i++){
		out.println( foodList[i]+"  "+costList[i]+"  "+storeList[i]+"<br>");
	}




// 	Cookie[] cooks = request.getCookies();

// 	String cookName="";
// 	String cookValue="";
	
// 	for(int i=0; i<cooks.length; i++){
// 		cookName = cooks[i].getName();
// 		cookValue = cooks[i].getValue();
		
// 		out.println( cookName + "  " + cookValue+"<br>");
// 	}
%>




</body>
</html>





