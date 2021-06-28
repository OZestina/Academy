package 반복문;

public class 반복문2 {
	
	public static void main(String[] args) {
		//1부터 5까지 반복해서 찍어보자
		
		//반복문 안에 들어가는 변수(보통 i)는 횟수를 카운팅할 때도 사용하고
		//변수에 들어있는 값을 가지고 처리할 때도 사용한다
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}
		
		//1~10까지 2씩 점프해서 찍어보자
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
				
		//1~100까지 5씩 점프해서 찍어보자
		for (int i = 1; i <= 100; i = i+5) {
			System.out.println(i);
		}
		
		//100부터 1까지 1씩 점프해서 찍어보자
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
		//1000부터 0까지 8씩 점프해서 찍어보자
		int a=0;
		for (int i = 1000; i >= 0; i -= 8) {
			System.out.println(i);
			a++;
		}
		System.out.println(a);
		
	}
	
}
