<!-- 쿠키심기 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%	//scriptlet, 스크립트릿: 작은 스크립트
    	//applet: application + let(작은), 작은 프로그램
    	
    	//쿠키는 브라우저에 텍스트로 저장되기 때문에 문자열만 허용한다
    	Cookie c1 = new Cookie("name", "honggildong");	//name, value
    	Cookie c2 = new Cookie("age", "100");
    	
    	//브라우저에게 쿠키를 심으라고 명령함
    	response.addCookie(c1);
    	response.addCookie(c2);
    	
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
브라우저에 쿠키를 심었음 <br>
<a href="쿠키확인.jsp"> 쿠키확인하러 가기</a>
</body>
</html>



<!-- 쿠키가져오기 -->
<!-- 쿠키 가져오기는 한꺼번에 모두 가져와야 한다! -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    Cookie[] cookies = request.getCookies();
    for(Cookie c: cookies){
    	//out.print() 브라우저에 텍스트로 출력, 스크립트릿 안에서만 사용
    	
    	//전체 리스트 출력
    	//out.print(c.getName() + "," + c.getValue()+"<br>");
    	
    	//쿠키의 이름이 age인것만 프린트해보자
    	if(c.getName().equals("age")){
    		out.print(c.getValue() + "<br>");
    	}
    	
    	
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키의 개수: <%= cookies.length %><br>

</body>
</html>
