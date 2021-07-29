<!-- 2021.07.29 updated -->
<!-- 결제 메인 페이지 -->


<%@page import="pay.PayDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pay.PayDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String buyerid = request.getParameter("buyerid");

PayDAO dao = new PayDAO();
ArrayList<PayDTO> payList = dao.payRead(buyerid);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>payMain</title>
</head>
<body>
	<h4>결제내역 보기</h4>
	<hr>

	<form action="payMain.jsp">
		buyerid : <input name="buyerid"><br>
		<button type="submit">뭘 샀는지 다시 확인</button>
	</form>
	<br>
	<form action="payDelete.jsp">
		<br>
		<table border='1'>
			<tr style="text-align: center;">
				<td>주문번호</td>
				<td>결제일</td>
				<td>숙소 id</td>
				<td>체크인</td>
				<td>체크아웃</td>
				<td>가격</td>
				<td>주문취소</td>
			</tr>

	<h4>결제내역</h4>

			<%
			for (int i = 0; i < payList.size(); i++) {
			%>
			<tr>
				<td style="text-align: center;"><%=payList.get(i).getPayid()%></td>
				<td><%=payList.get(i).getPaydate()%></td>
				<td style="text-align: center;"><%=payList.get(i).getProid()%></td>
				<td><%=payList.get(i).getCheckin()%></td>
				<td><%=payList.get(i).getCheckout()%></td>
				<td style="text-align: right;"><%=payList.get(i).getPayprice()%></td>

				<td style="text-align: center;"><input type="checkbox"
					name="payid" value=<%=payList.get(i).getPayid()%> >
				</td>
			</tr>
			<%
			}
			;
			%>

		</table>
		<br>
	<button type="submit">주문 취소</button>
	</form>


</body>
</html>
