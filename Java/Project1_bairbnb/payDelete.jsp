<!-- Updated 2021.08.10 12:00 -->
<!-- Updated 2021.08.09 오전 10:20 -->

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
	response.sendRedirect("payMain.jsp");
		
   	%>
    
