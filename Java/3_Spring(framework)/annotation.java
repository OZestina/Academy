//클래스&메서드의 용도를 알려주는 것

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller annotation을 클래스에 달면 컨트롤러 클래스로 인식
@Controller	//Annotation 어노테이션
public class BbsController {
	
	//@RequestMapping으로 컨트롤러 요청
  //@RequestMapping으로 요청되는 가상 주소는 절대 중복되면 안된다!
	@RequestMapping("bbs.mega")
	public void bbs(BbsDTO bbsDTO, String date) {
		System.out.println(bbsDTO); //BbsDTO toString 오버라이드 해뒀어야 가능^^
		System.out.println("컨트롤러에서 받은 날짜"+ date);
	}

}






import org.springframework.stereotype.Repository;

//특정한 방법을 가지고 처리하는 파일: 방법파일(Model, DAO)
@Repository	//DB처리해주는 Model에 annotation
public class MemberDAO {
	public void insert(MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
	}
}
