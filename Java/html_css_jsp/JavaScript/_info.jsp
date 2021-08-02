<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
//자바 스크립트     vs 자바
//클라이언트에서 실행 / 서버에서 실행

//클라이언트 팝업창은 alert
	alert('welcome.@@@@@@')
	alert('welcome again.@@@@@@')
	
//자바 스크립트는 변수에 들어가는 데이터의 타입이 값이 들어갈 때 결정
	//var name = prompt('write your name') //var은 없어도 됨
	name = prompt('write your name')		//입력값은 모두 String으로 저장
	age = 100								//얘는 정수로 저장
	age = prompt('당신의 나이를 입력하세요')
	age2 = parseInt(age)+1
	alert('당신의 이름은 '+name+'이고, 나이는 '+age2+'입니다')


//window, location, console, history, document

	
	//F12 콘솔에 뜬당
	console.log('내가 콘솔에 찍혀요')
	//
	document.write("내가 body부분에 찍혀요")
	
	result = confirm('배가 고프신가요')	//yes or no 2개 버튼 뜬다
	if(result){	//yes(true)일 경우
		alert("let's go to eat")
	}
	
	//여기로 이동해요
	location.href = "http://www.naver.com"

//값&타입 비교
n1 = '100'
n2 = 100
alert(n1==n2)	//true	//타입에 상관없이 값 비교
alert(n1===n2)	//false	//타입도 동일한 지 비교


</script>

</head>
<body>

	

</body>
</html>
