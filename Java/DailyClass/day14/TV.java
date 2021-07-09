package 클래스생성;

//Object가 부모
public class TV extends Object {

	// 클래스를 만들 때는 그 부품들이 가지는 특징을 선택해서 틀을 만들게 된다
	// 1)성질 : 채널, 볼륨, 전원 => 변수에 저장
	// 2)동작 : 켜다, 끄다, 볼륨높이기 => 메소드로 생성

	public int ch; // 자동초기화, 전역변수 (지역변수는 자동초기화 ㄴㄴ)
	public int vol;
	public boolean onOff;

	
	// 멤버메서드
	// 1)입력값이 있는가
	// 2)반환값이 있는가
	public void tvOn() {
		if (onOff == false) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 원래 켜져있었습니다.");
		}
	}
	public void tvOff() {
		if (onOff == true) {
			System.out.println("TV가 꺼졌습니다.");
		} else {
			System.out.println("TV가 원래 꺼져있었습니다.");
		}
	}
	public void volUp() {
		System.out.println("볼륨을 1 올렸습니다.");
	}

}

