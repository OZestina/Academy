package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요>>> ");
		String name = sc.next(); // 단어 기준 String 입력
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("당신의 소속을 입력하세요>>> ");
		String place = sc.next(); // 문장 기준(enter 입력 기준) String 입력
		System.out.println("당신의 소속은 " + place);
		
		int number = sc.nextInt(); 
		System.out.println("당신의 소속은 " + number);
		

	}

}
