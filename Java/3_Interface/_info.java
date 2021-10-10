//DAO등의 메서드 추상 선언을 담아 어떤 이름, 파라미터, 리턴값을 가지는 지 알려주는 파일
//interface를 먼저 작성해 그에 맞게 분업 진행해도 되고
//기존의 파일을 기반으로 interface를 역추출할 수도 있다

//java class 생성 시 interface는 다중상속이 가능하다!!


//INTERFACE
package interfaceTest;

public interface MemberDAOInterface {
	//규칙만 정의한 문서역할
	//interface에는 추상메서드만 저장한다 (일반메서드는 노노!)
	
	//불완전한 메서드 => 추상메서드 (abstract method)
	//반환값, 메서드, 입력값만 추상적으로 생성
	
	//Refactor > Extract interface 를 통해 만들면
	//각 메서드 앞에 public과 abstract가 제외된 형태로 만들어짐 (public abstract) 생략가능
	//하기의 세개 문장은 인터페이스 파일 내에서 동일한 의미를 가진다!
	//int delete(String id); 
	//abstract int delete(String id);
	//public abstract int delete(String id);
	
	public abstract int insert(String id, String pw, String name, String tel);

	int update(String id, String tel);

	int delete(String id);

	String select(String id);

}


//Java Class Interface implemented
package interfaceTest;

public class MemberDAO implements MemberDAOInterface {  //implements
//crud
	
	@Override
	public int insert(String id, String pw, String name, String tel) {
		return 1;
	}
	@Override
	public int update(String id, String tel) {
		return 1;
	}
	@Override
	public int delete(String id) {
		return 1;
	}
	@Override
	public String select(String id) {
		return "ok";
	}
}
