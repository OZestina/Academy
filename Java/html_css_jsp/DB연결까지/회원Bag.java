package shop.dto;

public class 회원Bag {
	//public: 모든 패키지에서 접근 가능
	//private: 해당 클래스 내에서만 접근 가능
	//default(접근 제어자가 없을 경우): 같은 패키지에서만 접근 가능
	
	//멤버변수, 클래스 바로 아래 선언됨
	//전역변수(global), 자동 초기화됨.
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//값을 넣을 때는 set변수명()
	//값을 꺼낼 때는 get변수명()
	//getters, setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "회원Bag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
	
	
	

}
