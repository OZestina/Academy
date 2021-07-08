package 클래스생성;

public class Car {
	//전역변수(global, 글로벌변수)
	
	//성질: 멤버변수로 만든다
	public String color;	//class 멤버변수는 데이터형의 default 값으로 자동 초기화
	public int wheel;		//자동초기화 0
	
	//동작 => 멤버메서드
	public void run() {
		//함수의 기능 정의
		System.out.println("네 바퀴로 달려달려");
	}
	
	public void up() {
		System.out.println("속도가 20 빨라진다");
	}

}
