<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
//alert("tern project")
function idCheck() {
	//1. id에 입력한 값 가지고 오기
	//1-1. input 값 찾기: id ='id'인 input tag 찾기
	idTag = document.getElementById("id");	//<input name = "id" id = "id" value='test'>
	//1-2. 그 태그 내에 있는 value 값을 가지고 오기
	idValue = idTag.value;	//value="test"
	//alert('id is' + idValue);
	
	//2. 값의 글자 수를 세야함
	//alert('id 길이' + idValue.length);
	
	//3. 5글자 이상이 아닌 경우, 메시지를 보여줘야함
	result = "";
	if (idValue.length >= 5) {
		result = "5글자 이상. 유효합ㄴ"
	} else{
		result = "5글자 미만. 재입력해주세요"
	}
	divTag = document.getElementById("result");	//<div id = "result"> </div> 가져옴
	divTag.innerHTML = result;					//태그 안에 이걸 넣어라 (tag도 텍스트도 다 넣을 수 있어)
}

function pwCheck(){
	pw1Tag = document.getElementById("pw1");
	pw2Tag = document.getElementById("pw2");
	pw1Value = pw1Tag.value;
	pw2Value = pw2Tag.value;
	
	divTag = document.getElementById("result");
	result = "";
	if (pw1Value == pw2Value) {
		result = "두 pw 입력값이 같습니다 <img src=../img/ozestina.jpg>";
	}else{
		result = "두 pw 입력값이 다릅니다. 다시 확인해주세요";
	}
	divTag.innerHTML = result;
	
}


</script>

</head>
<body>

<h3>자바 스크립트 테스트</h3>
<hr>
<!-- html에서는 name, js에서는 id -->
ID: <input name = "id" id = "id" value='test'> <button onclick="idCheck()" id='b1'>글자수 체크</button> <br>

PW: <input name = "pw1" id = "pw1"> <br>
PW check: <input name = "pw2" id = "pw2"> <button onclick="pwCheck()" id='b2'>패스워드 체크</button> <br>
<hr>
<div id = "result" style="color:red; background:yellow; width:500px; height:50px; font-size:30px">

</div>


</body>
</html>
