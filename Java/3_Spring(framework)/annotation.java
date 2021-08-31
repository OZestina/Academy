//annotation: 클래스&메서드의 용도를 알려주는 것

// Controller: 싱글톤 객체 생성, 스프링에 컨트롤러로 등록
// Autowired: 싱글톤 객체 생성된 것 중에 해당 타입의 객체의 주소를 넣어줌. (데이터 타입을 가지고 찾아줌)
// RequestMapping: 요청한 주소와 매핑되는 것을 찾아서 아래 정의된 메서드를 호출
// Repository: 싱글톤 객체 생성, 스프링에 모델(DB처리 클래스)로 등록

//Controller annotation을 클래스에 달면 컨트롤러 클래스로 인식
@Controller
public class BbsController {
	
	@Autowired	//싱글톤으로 만들어진 애를 껴죠!
	MemberDAO dao;	//스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다.
	
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 프린트: "+dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			return "ok";			//views> ok.jsp로 이동
		} else {
			return "redirect:index.jsp";	//webapp> index.jsp 로 이동
		}
	}
}


//특정한 방법을 가지고 처리하는 파일: 방법파일(Model, DAO)
//DAO는 싱글톤으로 만들어주어야한다
@Repository	//annotation으로 싱글톤으로 만들어준다. getInstance 필요없다!!
			//싱글톤 객체가 아니면 annotation 달지 않는다.
public class MemberDAO {
	public boolean login(MemberDTO dto) {
		String dbID = "root";
		String dbPW = "1234";
		boolean result = false;
		if (dto.getId().equals(dbID) && dto.getPw().equals(dbPW)) {
			result = true;
		}
		return result;
	}
}
