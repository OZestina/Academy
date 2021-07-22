<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    String title = request.getParameter("title");
    String writer= request.getParameter("writer");
    String content = request.getParameter("content");
    String type = request.getParameter("type");
    String department = request.getParameter("department");
    String date = request.getParameter("date");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>입력받은 값 정리</h3>
<hr>
제목: <%= title %> <br>
글쓴이: <%= writer %> <br>
내용: <%= content %> <br>
종류: <%= type %> <br>
부서: <%= department %> <br>
날짜: <%= date %> <br>

</body>
</html>