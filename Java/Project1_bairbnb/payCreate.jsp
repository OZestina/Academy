<!-- 스케줄러(장바구니)를 통한 결제 jsp -->
<!-- DB작업 마친 후 payMain으로 자동 다이렉트 -->

<%@page import="pay.PayDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	<%
   	
		String buyerid = request.getParameter("buyerid");
		
		PayDAO dao = new PayDAO();
		dao.payCreate(buyerid);

   	%>
    
<jsp:forward page="payMain.jsp"></jsp:forward>
