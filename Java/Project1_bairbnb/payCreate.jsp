<!-- 2021.08.05 updated -->
<!-- 결제 jsp -->
<!-- 결제 작업 마친 후 payMain으로 자동 다이렉트 -->

<%@page import="cart.CartDAO"%>
<%@page import="cart.CartDTO"%>
<%@page import="member.MemberDAO"%>
<%@page import="product.ProDAO"%>
<%@page import="product.ProDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pay.PayDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String memid = (String)session.getAttribute("memid");

String[] cartidx = request.getParameterValues("cartidx");

MemberDAO mem = new MemberDAO(); 
String name = mem.read(memid).getName();
String tel = mem.read(memid).getTel();

ProDAO pro = new ProDAO();

CartDAO cart = new CartDAO();
String buyName = pro.read(cart.cartRead(Integer.parseInt(cartidx[0])).getProid()).getPronam();

int totalPrice = 0;
for (int i = 0; i < cartidx.length; i++) {
	totalPrice += cart.cartRead(Integer.parseInt(cartidx[i])).getCartprice();
} 

if(cartidx.length > 1){
	buyName = buyName + "외 " + (cartidx.length-1)+"건";
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>베어비앤비: 결제하기</title>
<!-- 아래는 css 링크 -->
<link rel="stylesheet" href="css/board.css">
<!-- 아래는 폰트 링크 -->
<!-- css에서
	font-family: 'Noto Sans KR', sans-serif;
	font-size : 사이즈pt; (eg. 15pt;)
	font-weight : 300 / 400 / 500 골라서 넣으면 돼요 (500이 가장 굵은 거)
 -->
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500&display=swap"
	rel="stylesheet">
<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<!-- iamport.payment.js -->
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>


<script type="text/javascript">

function pay() {
	var IMP = window.IMP; // 생략가능
	IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
	IMP.request_pay({
		pg : 'inicis', // version 1.1.0부터 지원.
		pay_method : 'card',
		merchant_uid : 'merchant_' + new Date().getTime(),
		name : '<%=buyName %>',			
		amount : <%= totalPrice %>,		
		buyer_email : ' ',
		buyer_name : '<%=name%>',			
		buyer_tel : '<%=tel%>',
		buyer_addr : ' ',
		buyer_postcode : ' ',
		m_redirect_url : ' '
	}, function(rsp) {
		if ( rsp.success ) {	//true일 경우
			var msg = '결제가 완료되었습니다.';
			msg += '고유ID : ' + rsp.imp_uid;
			msg += '상점 거래ID : ' + rsp.merchant_uid;
			msg += '결제 금액 : ' + rsp.paid_amount;
			msg += '카드 승인번호 : ' + rsp.apply_num;
						
			//결제 성공 시 DB 작업
			<%
			PayDAO dao = new PayDAO();
			for (int i = 0; i < cartidx.length; i++) {
				dao.payCreate(Integer.parseInt(cartidx[i]));
			}
			%>
			//DB작업 후 payMain.jsp(결제내역확인) 페이지로 이동						
			location.href = "payMain.jsp";
			
		} else {
			var msg = '결제에 실패하였습니다.';
			msg += '에러내용 : ' + rsp.error_msg;
			alert(msg);
		}
	});
}
	
	
</script>
</head>
<body>
	<div id="main">
		<div id="topmenu">
			<jsp:include page="topmenu.jsp"></jsp:include>
		</div>
		<div id="content">
		<div class="title">
			<h2>결제 내역 확인</h2>
		</div>
				
		<table>
		<tr class = "header_tr">
			<td class="header">#</td>
			<td class="header">숙소ID</td> 
			<td class="header">숙소명</td> 
			<td class="header">체크인</td>
			<td class="header">체크아웃</td>
			<td class="header">가격</td>
		</tr>

		<%
		for (int i = 0; i < cartidx.length; i++) {
		%>
		<tr>
			<td class="info"><%=i + 1%></td>
			<td class="info"><%=cart.cartRead(Integer.parseInt(cartidx[i])).getProid()%></td>
			<td class="info"><%=pro.read(cart.cartRead(Integer.parseInt(cartidx[i])).getProid()).getPronam()%></td>
			<td class="info"><%=cart.cartRead(Integer.parseInt(cartidx[i])).getCcheckin()%></td>
			<td class="info"><%=cart.cartRead(Integer.parseInt(cartidx[i])).getCcheckout()%></td>
			<td class="info"><%=cart.cartRead(Integer.parseInt(cartidx[i])).getCartprice()%></td>
		</tr>
		<% }; %>
		
		<tr>
			<td colspan='5' style="text-align: center">총 가격</td>
			<td style="text-align: right;"><%=totalPrice%></td>
		</tr>
		</table>
		<br>
		<button onclick = "pay()">선택 숙소 삭제</button>
		<br>
		</div>
		
		<div class="botmenu">
			<jsp:include page="botmenu.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>


