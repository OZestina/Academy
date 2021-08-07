<!-- 2021.08.03 updated -->
<!-- 스케줄러(장바구니) 생성 jsp -->
<!-- DB작업 마친 후 cartMain으로 자동 다이렉트 -->

<%@page import="cart.CartDTO"%>
<%@page import="cart.CartDAO"%>
<%@page import="calendar.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	<%
   	
   	String memid = (String)session.getAttribute("memid");

	int proid = Integer.parseInt(request.getParameter("proid"));
	
	//체크인,체크아웃 - 일수 계산
	String checkinout = request.getParameter("checkinout");
	String ccheckin = checkinout.substring(0, 10);
	String ccheckout = checkinout.substring(14, checkinout.length());
	Calendar dateCount = new Calendar();
	int totalDays = dateCount.totalDay(ccheckin, ccheckout);
	
	int cartprice = Integer.parseInt(request.getParameter("cartprice")) * totalDays;
	
	CartDTO cart = new CartDTO(memid, proid, ccheckin, ccheckout, cartprice);
	CartDAO dao = new CartDAO();
	dao.cartCreate(cart);
	
	
	//체크인,체크아웃 - 일수 계산

	

   	%>
    
    
<!-- 상세페이지로 이동하도록 링크 변경 -->
<jsp:forward page="cartMain.jsp"></jsp:forward>
