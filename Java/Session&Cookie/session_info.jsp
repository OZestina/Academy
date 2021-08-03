<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//스크립트 릿: 자바코드가 들어간당

String id = request.getParameter("id");
String pw = request.getParameter("pw");
String id1 = "root";
String pw1 = "1234";

String result = "로그인 실패";
if (id.equals(id1) && pw.equals(pw1)) {
	result = "로그인 성공";
	//로그인 성공하고 나서, id를 세션으로 잡아주어야 한다.

	// 자바의 내장된 객체(built-in object): 미리 객체를 만들어서 제공 (톰켓에서 제공)
	// request, response, session, out, application
	// HttpSession session = new HttpSession();

	//세션도 내장된 객체로 제공된다
	//세션 설정은 setAttribute
	//세션 가져오는 거는 getAttribute
	session.setAttribute("id", id);

	// 자바스크립트의 내장된 객체
	//location, window, document, history, console
} else {
	//스크립트 릿자바 안에서 html 출력을 원하는 경우 out.print 사용
	//out.print 안은 html이어서 html 태그 사용 가능!
	out.print("재로그인해주세요<br>");
}
%>

<!-- 세션을 끊어주는 처리를 해야함 -->
    <%
    	//id세션만 제거하고자 하는 경우
    	//session.removeAttribute("id");
    	
    	//잡힌 모든 세션을 제거하고자 하는 경우
    	//session.invalidate();
    %>

//response 객체: 서버가 클라이언트에게 특정 처리를 하라고 명령할 때 사용
    	// <-> request: 클라이언트로부터 넘어온 데이터를 받을 때 사용
    	//response.sendRedirect("session_로그인처리.jsp");

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	로그인 결과:
	<%=result%> <!-- 표현식, expression -->
	<br>

	<!-- session이 잡혀있는지 아닌지 체크하고자 하는 경우 세션이 null인지를 체크하면 된다 -->
	<%	if (session.getAttribute("id") != null) {	%>
		세션 id값은:	<%=session.getAttribute("id")%>
		<!-- 세션만 찍을 때는 이렇게 써도 됨! -->
		전체 조회수: ${id}
	<%	}	%>


</body>
</html>
