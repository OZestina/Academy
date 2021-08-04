<!-- 결제 진행 이후 DB 저장용 jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%

    	String pId = request.getParameter("pId");
    	String sId = request.getParameter("sId");
    	String pName = request.getParameter("pName");
    	String amount = request.getParameter("amount");
    
    //이렇게 가져온 값으로 DB에 저장하도록 DAO 실행
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
<!-- 이렇게 html로 프린트도 할 수 있다 -->
  
<%= sId %>님의 결제 내역
<hr>
상품ID: <%=pId %> <br>
상품name: <%= pName %><br>
상품amount: <%=amount %><br>
</body>
</html>
