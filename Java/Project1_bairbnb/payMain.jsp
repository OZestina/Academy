<!-- 2021.07.28 updated --> 
<!-- 결제 메인 페이지 -->


<%@page import="pay.PayDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pay.PayDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
   	
		String buyerid = request.getParameter("buyerid");
	
		PayDAO dao = new PayDAO();
		ArrayList<PayDTO> cartList = dao.payRead(buyerid);
		
   	%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>payMain</title>
</head>
<body>
<h3>결제내역 보기</h3>
<hr>
	
	<form action="payMain.jsp">
		buyerid : <input name="buyerid"><br>
		<button type="submit">뭘 샀는지 다시 확인</button>
	</form><br>

	<%   	
		for (int i = 0; i < cartList.size(); i++) {
			out.println(cartList.get(i));
		}

   	%>

	
</body>
</html>
