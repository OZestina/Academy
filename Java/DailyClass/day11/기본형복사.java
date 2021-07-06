package 문제풀이;

public class 기본형복사 {

	public static void main(String[] args) {
		
		//RAM의 변수에 들어있는 값을 복사
		//변수에 저장된 것은 값 or 주소값
		
		int x = 100;
		int y = x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("=================");
		
		x = 200;
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
