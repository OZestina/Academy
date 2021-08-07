<%@page import="java.util.ArrayList"%>
<%@page import="product.ProDAO"%>
<%@page import="product.ProDTO"%>
<%@page import="pay.PayDTO"%>
<%@page import="pay.PayDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String memid = (String)session.getAttribute("memid");
		memid = "test1";
		
    	//int proid=Integer.parseInt(request.getParameter("proid"));
    	int proid = 1;
    	
    	ProDTO bag = new ProDTO();
    	bag.setProid(proid);
    	ProDAO dao = new ProDAO();
    	ProDTO bag2 = dao.read3(bag);
    	
    	PayDAO payDAO = new PayDAO();
    	ArrayList<String[]> sold = payDAO.payRead(proid);
    	
    %> 
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.roomImg {
	width: 100%;
	max-height: 190px;
	object-fit: cover;
	border-radius: 15px;
}
</style>
<meta charset="UTF-8">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flatpickr/4.2.3/flatpickr.css">

<title>Insert title here</title>

<script type="text/javascript">

	function inputCheck(){
		if (document.getElementsByName('checkinout')[0].value == '' || document.getElementsByName('checkinout')[0].value ==null){
			alert( '예약할 일정을 입력해주세요' );
			return false;
		} else {
			var checkin = document.getElementById('rangeDate').value.substring(0,10); 
			var checkout = document.getElementById('rangeDate').value.substring(14,24);
			var sdt = new Date(checkin);
	 		var edt = new Date(checkout);
			var dateDiff = Math.ceil((edt.getTime()-sdt.getTime())/(1000*3600*24));
			var price = dateDiff*<%=bag2.getProprice()%>
			
			var msg = checkin+"에서 "+checkout+"까지 총 "+dateDiff+"일, "+price+"원입니다.\n계속 진행하시겠어요?"
			result = confirm(msg);
			if (result){
				return true;
			} else {
				return false;
			}
		}
		
	}
		
	function mem_check() {
		alert('로그인 후 예약이 가능합니다.');
	}

</script>

</head>
<body bgcolor="darkgray">
<h3></h3>
<hr>
<h3></h3>
<strong>BairBnB</strong>
<h3></h3>
<hr>
<form>
<tr>
	
	<ul><fieldset>
	<h3></h3>  
		<strong><td>상품번호: <%=bag2.getProid()%>번</td><br>
		<input type="hidden" id="hidden" name="proid" value="<%=bag2.getProid()%>">
	<h3></h3>
	<figure>
		<td><img src ="<%=bag2.getProimg()%>" class ="roomimg"></figure></td><br>
								
		<td>판매자아이디: <%=bag2.getMemid()%></td><br>
	<h3></h3>
		<td>숙소명: <%=bag2.getPronam()%></td><br>
	<h3></h3>
		<td>숙소주소: <%=bag2.getProadd()%></td><br>
	<h3></h3>
		<td>전화번호: <%=bag2.getProtel()%></td><br>
	<h3></h3>
		<td>주차가능여부: <%=bag2.getPropk()%></td><br>
	<h3></h3>
		<td>와이파이: <%=bag2.getProwifi()%></td><br>
	<h3></h3>
		<td>애완동물가능여부: <%=bag2.getPropet()%></td><br>
	<h3></h3>
		<td>조식제공여부: <%=bag2.getProbk()%></td><br>
	<h3></h3>
		<td>가격(1박): <%=bag2.getProprice()%>원</td><br></strong>
		<input type="hidden" id="hidden" name="cartprice" value="<%=bag2.getProprice()%>">
	</ul></fieldset>
<hr>

</tr>
<h3>숙소 예약하기</h3>


<div>
체크인-체크아웃 기간 선택: <input type="text" name='checkinout' id="rangeDate" >
</div>


	<%
	if (memid == null) {
	%>

	<button type="submit" onclick = "mem_check();" >장바구니 추가</button>
	<button type="submit" onclick = "mem_check();" >숙소 바로 결제</button>

	<%
	} else {
	%>
	<button type="submit" onclick = "return inputCheck();" formaction="cartCreate.jsp">장바구니 추가</button>
	<button type="submit" onclick = "return inputCheck();" formaction="payCreateDirect.jsp">숙소 바로 결제</button>
	<%
	}
	%>


</form>

</body>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/flatpickr/4.2.3/flatpickr.js"></script>

<script>
$("#rangeDate").flatpickr({
    mode: 'range',
    minDate: "today",
    dateFormat: "Y-m-d",
    disable: [
    	<% for (int i = 0; i<sold.size(); i++){ %>
        {
            from: "<%=sold.get(i)[0]%>",
            to: "<%=sold.get(i)[1]%>"
        },
        <%}%>
    ]
});
</script>

</html>
