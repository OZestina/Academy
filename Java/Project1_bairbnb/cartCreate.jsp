<!-- 스케줄러(장바구니) 생성 jsp -->
<!-- DB작업 마친 후 cartMain으로 자동 다이렉트 -->

<%@page import="cart.CartDTO"%>
<%@page import="cart.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   	<%
   	
		String buyerid = request.getParameter("buyerid");
		int proid = Integer.parseInt(request.getParameter("proid"));
		String ccheckin = request.getParameter("ccheckin");
		String ccheckout = request.getParameter("ccheckout");
		int cartprice = Integer.parseInt(request.getParameter("cartprice"));
		
		CartDTO cart = new CartDTO(buyerid, proid, ccheckin, ccheckout, cartprice);
		CartDAO dao = new CartDAO();
		dao.cartCreate(cart);

   	%>
    
<jsp:forward page="cartMain.jsp"></jsp:forward>
