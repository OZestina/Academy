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
//기본 선택자(tag, id, class), selector
	$(function() {	
		
		//alert('body부분 dom tree로 모두 읽어들였음')
		
		$('#b1').click(function() {
			alert('you pushed the button')
		})
		$('#b2').click(function() {
			alert('you pushed the button2')
		})
		$('#b3').click(function() {
			alert('you pushed the button3')
		})
		
		$('#b4').click(function() {
			location.href="domTree.jsp";
		})
		$('#b5').click(function() {
			in1Value = $('#in1').val();
			alert(in1Value);
			//사이트를 찾아서, 조건에 따라서 사이트로 전환
 			if (in1Value == 1){
				location.href = "https://www.google.com/search?q=%EC%A7%9C%EC%9E%A5%EB%A9%B4&tbm=isch&ved=2ahUKEwielLfN-5jyAhVBxGEKHbFMDqkQ2-cCegQIABAA&oq=%EC%A7%9C%EC%9E%A5%EB%A9%B4&gs_lcp=CgNpbWcQDFAAWABgjIgBaABwAHgAgAEAiAEAkgEAmAEAqgELZ3dzLXdpei1pbWc&sclient=img&ei=bl4LYZ6lL8GIhwOxmbnICg&bih=954&biw=1569";
			} else if (in1Value == 2) {
				location.href = "https://www.google.com/search?q=%EB%83%89%EB%A9%B4&tbm=isch&ved=2ahUKEwiMj5G19pjyAhWI7WEKHUi8BgIQ2-cCegQIABAA&oq=%EB%83%89%EB%A9%B4&gs_lcp=CgNpbWcQAzIICAAQgAQQsQMyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BAgAEANQtIkCWPSUAmD2lQJoAHAAeACAAdwBiAHYBpIBBTMuMy4xmAEAoAEBqgELZ3dzLXdpei1pbWewAQDAAQE&sclient=img&ei=_VgLYcycJ4jbhwPI-JoQ&bih=954&biw=1569";
			} else if (in1Value == 3) {
				location.href = "https://www.google.com/search?q=%EB%AC%BC&tbm=isch&ved=2ahUKEwi6kcLG9pjyAhWjx4sBHbs1A6sQ2-cCegQIABAA&oq=%EB%AC%BC&gs_lcp=CgNpbWcQAzIICAAQgAQQsQMyCAgAEIAEELEDMggIABCABBCxAzIICAAQgAQQsQMyCAgAEIAEELEDMggIABCABBCxAzIICAAQgAQQsQMyCAgAEIAEELEDMggIABCABBCxAzIFCAAQgAQ6CwgAEIAEELEDEIMBUPlSWLdbYLZcaABwAHgAgAFpiAGHA5IBAzIuMpgBAKABAaoBC2d3cy13aXotaW1nsAEAwAEB&sclient=img&ei=IlkLYbr4BaOPr7wPu-uM2Ao&bih=954&biw=1569";
			}
			
		})
		$('#b6').click(function() {
			in2Value = $('#in2').val();
			in3Value = $('#in3').val();
			
			//html 출력을 위해 일단 코드 작성할 태그 찾기
			result1Tag = $('#result1');
			
			if(in2Value == 1 && in3Value == 1){
				//alert('우산을 가져가세요');
				//result1Tag.text('우산을 가져가세요');							//text만 넣을 경우
				result1Tag.html('<font color=blue>우산을 가져가세요</font><br>');	//tag도 넣고 싶을 경우
			} else{
				//result1Tag.html('<font color=red>우산을 가지고 가지 말자</font>');	//html은 덮어쓴다
				result1Tag.append('<font color=red>우산을 가지고 가지 말자</font>');	//append는 이어쓴다
				
			}
			
		})
		
	})
	
</script>

</head>
<body>

<button id=b1>push me</button>
<button id=b2>push me 2</button>
<button id=b3>push me 3</button>
<br>
<button id=b4>사이트 이동</button><br>

먹고싶은 메뉴 1)짜장면 2)냉면 3)물 : <input id = in1>
<button id=b5>입력값 읽어서 처리</button><br>

비가 오나요 1)예 2)니오: <input id = in2>
구름이 많나요 1)예 2)니오 : <input id = in3>
<button id=b6>입력값 읽어서 처리2</button>

<hr color=red>

<div id=result1> 결과가 나타나는 곳
	
</div>

</body>
</html>
