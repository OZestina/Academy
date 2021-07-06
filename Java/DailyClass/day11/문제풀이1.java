package 문제풀이;

import java.util.Scanner;

public class 문제풀이1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//전화번호 입력:     011-245-1234   "
		System.out.print("전화번호 입력>> ");
		String input = sc.nextLine();
		
		//1) 양쪽공백 제거
		String trimm = input.trim();
		
		//2) -을 기준으로 분리
		String[] splitt = trimm.split("-");
		
		//3) 첫 번째 문자열: 011-SK, 019-LG, 나머지-Apple
		System.out.print("통신사는 ");
		if (splitt[0].equals("011")) {
			System.out.println("SK");
		} else if (splitt[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		//4) 두 번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		System.out.print("당신의 휴대폰은 ");
		if (splitt[1].length()>=4) {
			System.out.println("최신폰입니다.");
		} else {
			System.out.println("올드폰입니다.");
		}
		
		//5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효노노
		int sum = 0;
		for (int i = 0; i < splitt.length; i++) {
			sum += splitt[i].length();
		}
		
		if (sum >=10) {
			System.out.println("유효한 전화번호입니다.");
		} else {
			System.out.println("유효하지 않은 전화번호입니다. 다시 확인해주세요");
		}
		
		sc.close();
	}
}
