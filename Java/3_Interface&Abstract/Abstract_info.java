// [OOP의 2대 원칙]=======================================================
// 응집도는 높게: 하나의 클래스에는 하나의 기능만
// 결합도는 낮게: 변수 저장 시 특정한 클래스의 객체만으로 결합을 한정시키지 말자

// ApplePhone a = new Apple13();	  //응집도 낮음
// Apple13 b = new Apple13();		    //응집도 높음
// (ApplePhone: 부모클래스, Apple13: 자식클래스)


//상속받은 곳에서 무언가를 해주어야 완벽하게 사용할 수 있는 클래스를 추상클래스라고 하며, 그 자체로는 "불완전한 클래스"이다
//안드로이드 스튜디오의 BaseAdapter도 4개 메서드를 꼭 오버라이드 해줘야 해서 추상 클래스
//클래스에 추상이라는 단어가 붙으면 불완전하다는 의미이며, 추상 단어가 붙은 클래스(인터페이스, 추상 클래스) 객체를 생성하여 사용할 수 없음
//new BaseAdapter(); 객체 생성 불가!

//태초에 Phone interface가 있었다
public interface Phone {
	public final String COMPANY = "mega";	//파이널 상수만 사용 가능
	
	void internet();
	void call();
	void phone();
	void kakao();
}

//Mega interface가 두 개 인터페이스를 상속
public interface Mega extends Gps, Phone { //인터페이스는 다중상속 가능
	void siri();
}

//Mega interface를 적용한 ApplePhone의 탄생 (인터페이스 적용은 implements 사용)
public abstract class ApplePhone implements Mega {
	//추상클래스에 변수 선언 가능
	String tel = "010-2222-3333";
	
	//추상메서드를 하나라도 가지고 있으면 추상클래스  
	//추상클래스는 객체를 생성할 수 없으며, 상속받아 추상메서드를 정의한 후 사용해야한다
	
	//ApplePhone을 재사용해서 apple12, apple13 만들어야 하는데
	//서로 다른 camera 기능을 추가해야 한다면
	//camera()를 추상 메서드로 선언
	public abstract void camera();
	@Override
	public void map() {
		// TODO Auto-generated method stub
		System.out.println("map");
	}
	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("internet");
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call");
	}
	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("phone..?");
	}
	@Override
	public void kakao() {
		// TODO Auto-generated method stub
		System.out.println("kakao");
	}
	@Override
	public void siri() {
		// TODO Auto-generated method stub
		System.out.println("i didn't call you, siri");
	}
}

//ApplePhone을 상속한 Apple13 탄생! 
public class Apple13 extends ApplePhone {
	@Override
	public void camera() {              //추상메서드였던 camera() 오버라이드 필요!
		// TODO Auto-generated method stub
		System.out.println("apple13 camera");
	}
}
