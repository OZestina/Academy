<!-- 2021.08.03 updated -->
<!-- 장바구니에서 개별 목록 삭제를 위한 삭제 jsp -->
<!-- DB작업 마친 후 cartMain으로 자동 다이렉트 -->

<%@page import="cart.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String[] cartidxList = request.getParameterValues("cartidx");
CartDAO dao = new CartDAO();

//int totalDelete = 0;
for (int i = 0; i < cartidxList.length; i++) {
	int resultInt = dao.cartDelete(Integer.parseInt(cartidxList[i]));
	//totalDelete++;
}

// String result = "삭제실패";
// if (totalDelete > 0) {
// 	result = "삭제 성공";
// }
// System.out.println(result);
%>

<jsp:forward page="cartMain.jsp"></jsp:forward>
