//DB작업
	//1. DB, 테이블 생성
	//2. 데이터 조작(CRUD-Create,Read,Update,Delete)
	
	String ip = "localhost";	//localhost로 하면 자동으로 잡아줌
								            //아니면 자기 자신을 가리키는 127.0.0.1 입력
	String port = "3306";
	String id = "root";
	String pw = "1234";
	
	
	public void create() {
		System.out.println(ip+port+"에 연결됐습니다.");
		System.out.println("회원가입 처리");
	}
	
	public void read() {
		System.out.println("회원정보 검색 처리");
		
	}
	
	public void update() {
		System.out.println("회원정보 수정 처리");
		
	}
	
	public void delete() {
		System.out.println("회원정보 탈퇴 처리");
		
	}
	
}
