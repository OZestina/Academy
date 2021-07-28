<!-- 2021.07.28 updated -->    
<!-- 스케줄러(장바구니) 메인 페이지 -->
    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>스케줄러에 담기</h3>
<hr>
	<form action="cartCreate.jsp">
		buyerid : <input name="buyerid"><br>
		proid : <input name="proid"><br>
		ccheckin : <input name="ccheckin"><br>
		ccheckout : <input name="ccheckout"><br>
		cartprice : <input name="cartprice"><br>
		<button type="submit">스케줄러에 담긔</button>
	</form><br>
	<h3>스케줄러 보기</h3>
<hr>
	<form action="cartRead.jsp">
		buyerid : <input name="buyerid"><br>
		<button type="submit">스케줄러에 담긘 계획 살펴보긔</button>
	</form><br>
<h3>스케줄러 계산하기</h3>
<hr>
	<form action="payCreate.jsp">
		buyerid : <input name="buyerid"><br>
		<button type="submit">미래의 나에게 선물</button>
	</form><br>
	
	
</body>
</html>
