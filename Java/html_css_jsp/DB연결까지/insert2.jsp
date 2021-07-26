<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    게시판Bag bag = new 게시판Bag();
    bag.setId(id);
    bag.setTitle(title);
    bag.setContent(content);
    bag.setWriter(writer);
    
    게시판DAO dao = new 게시판DAO();
    dao.create(bag);
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
전송된 게시물 정보를 DB에 저장하도록 SQL문을 전송함.
</body>
</html>