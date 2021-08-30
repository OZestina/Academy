<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품 등록 완료</h3>
<hr>
  
<!-- 하기와 같은 스프링 문법으로 Controller에서 자동으로 생성된 DTO의 정보를 가져올 수 있다 -->
<!-- 자동으로 생성된 DTO의 정보만 가져올 수 있고, 별도로 받은 인수는 못가져온다 -->
${productDTO.pNo} <br>
${productDTO.name} <br>
${productDTO.content} <br>
${productDTO.date} <br>
</body>
</html>
