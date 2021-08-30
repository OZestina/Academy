<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품 입력 하긔</h3>
<hr>
  
<!-- form action에 Controller 메서드의 가상 주소 입력 가능 -->
<!-- Controller 메서드에서 처리한 후에는 webapp>views 하단에 저장된 같은 이름의 jsp 파일을 찾아 보여준다 -->
<!-- 하기의 경우 webapp>views> insert.jsp 파일로 자동 연결 -->
<form action="insert.do">
상품번호: <input type="text" name="pNo"><br>
상품이름: <input type="text" name="name"><br>
상품내용: <input type="text" name="content"><br>
날짜: <input type="date" name="date"><br>
<button>상품 등록</button>
</form>
    
<form action="bbs.mega">
번호: <input name="bNo"><br>
제목: <input name="title"><br>
내용: <input name="content"><br>
작성자: <input name="writer"><br>
작성자: <input type = "date" name="date"><br>
<button>글쓰기</button>
</form>
    
<!-- 하기와 같이 해도 controller 클래스 중 bbs.mega 매핑된 메서드로 이동 & 데이터 전달 -->
<a href="bbs.mega?bNo=100&title=test&content=test&writer=test&date=20210827">게시판 신청 완료2</a>

</body>
</html>
