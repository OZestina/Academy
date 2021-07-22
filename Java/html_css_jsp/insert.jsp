<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 1. 클라이언트가 전송한 데이터들을 가지고 와야 한다. -->
<%	//자바코드 입력 부분
//HttpServletRequest request = new HttpServletRequest();
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String com = request.getParameter("com");
String tel = request.getParameter("tel");
String gender = request.getParameter("gender");

String word = request.getParameter("word");
String[] hobby = request.getParameterValues("hobby");	//checkbox는 배열로!
String result = "";
if(hobby!=null){
	for(String x: hobby){
		result += x+" "; 
	}
}else{
	result = "없음";
}

%>

<!-- 2. 서버가 받은 데이터를 DAO를 통해 DB에 저장 -->
<!-- 3. DB처리에 따라 결과를 클라이언트에게 html로 알려주자 -->



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>서버에서 받은 값 정리</h3>
	<hr color="green">
	서버에서 받은 아이디:
	<%= id %>
	<br> 서버에서 받은 패스워드:
	<%= pw %>
	<br> 서버에서 받은 이름:
	<%= name %>
	<br> 서버에서 받은 전화번호:
	<%= com %>-<%= tel %>
	<br> 서버에서 받은 성별:
	<%= gender %>
	<br> 서버에서 받은 하고 싶은 말:
	<%= word %>
	<br> 서버에서 받은 취미:
	<%= result %>


</body>
</html>