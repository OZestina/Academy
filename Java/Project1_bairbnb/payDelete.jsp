<!-- 2021.08.03 updated -->
<!-- 결제 후 주문 취소를 위한 삭제 jsp -->
<!-- DB작업 마친 후 payMain으로 자동 다이렉트 -->

<%@page import="pay.PayDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	<%
		String[] payidList = request.getParameterValues("payid");
		PayDAO dao = new PayDAO();
		
		if(payidList != null){
			for(int i = 0; i<payidList.length; i++){
				int resultInt = dao.payDelete(Integer.parseInt(payidList[i]));
			}
		}
		
   	%>
    
<jsp:forward page="payMain.jsp"></jsp:forward>
