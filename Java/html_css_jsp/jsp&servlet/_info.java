package webpage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//JSP가 서버에서 실행될 때는 자바 프로그램으로 자동 코드 변경되어 실행된다
//이렇게 자동생성되는 자바 프로그램/자바코드를 서블릿(servlet)이라고 부른다
//servlet: server+let(릿,작은프로그램)
//JSP --> servlet: Tomcat내의 jsp엔진(서블릿엔진)이 가능하게 함

//JSP내에 작성한 모든 자바코드는 service() 메서드 안으로 들어가서 자동 생성
//JSP내에 선언된 변수는 모두 지역변수이다. 초기화를 반드시 해주어야한다. 스크립트릿 포함<% %>
//전역변수를 선언해서 사용하고자 하는 경우는 <%! %>로 선언
public class Page01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = req.getParameter("id");
		super.service(req, resp);
	}
}
