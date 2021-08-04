<!-- 결제 연동, 값 직접 입력 시-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String sId = "apple";	//session.getAttribute("memid");
    	String pId = "p100"; //request.getParameter("proid");
    	String amount = "2000";
    	int amount2 = Integer.parseInt(amount);
    	String pName = "socks";
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
<!-- iamport.payment.js -->
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>

<script type="text/javascript">

function pay(){
	var IMP = window.IMP; // 생략가능
	IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
	IMP.request_pay({
		pg : 'inicis', // version 1.1.0부터 지원.
		pay_method : 'card',
		merchant_uid : 'merchant_' + new Date().getTime(),
		name : '<%=pName %>',			//주문. 상품명?
		amount : <%= amount%>,		//int
		buyer_email : 'iamport@siot.do',
		buyer_name : '<%=sId%>',			//구매자 이름
		buyer_tel : '010-1234-5678',
		buyer_addr : '서울특별시 강남구 삼성동',
		buyer_postcode : '123-456',
		m_redirect_url : 'www.yourdomain.com/payments/complete'
	}, function(rsp) {
		if ( rsp.success ) {	//true일 경우
			var msg = '결제가 완료되었습니다.';
			msg += '고유ID : ' + rsp.imp_uid;
			msg += '상점 거래ID : ' + rsp.merchant_uid;
			msg += '결제 금액 : ' + rsp.paid_amount;
			msg += '카드 승인번호 : ' + rsp.apply_num;
			console.log(msg);
			
			//성공했을 때 DB 저장을 위해 별도 jsp로 이동
			location.href = "pay02.jsp?sId=<%= sId %>&pId=<%= pId %>&pName=<%= pName %>&amount=<%= amount2 %>"
			
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

결제금액: <input id = "money" ><br>
주문명: <input id = "name" ><br>

<button onclick="pay()"> 결제하기 버튼 </button>

</body>
</html>
