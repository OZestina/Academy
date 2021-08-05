<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">
//$:document
//$(): body태그 안을 먼저 램에 dom tree로 읽어들여라(loading)
//$(function() {}): body를 다 읽어들인 후, 입력값으로 넣은 이름없는 함수 부분을 실행해주세요 
	$(function() {	
		
		alert('body부분 dom tree로 모두 읽어들였음')
		
		$('#b1').click(function() {
			alert('you pushed the button')
		})
		$('#b2').click(function() {
			alert('you pushed the button2')
		})
		$('#b3').click(function() {
			alert('you pushed the button3')
		})
	})
	
</script>

</head>
<body>

<button id=b1>push me</button>
<button id=b2>push me 2</button>
<button id=b3>push me 3</button>

</body>
</html>
