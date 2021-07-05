package 문제풀이;

import java.util.Scanner;

public class 문제풀이1 {

	public static void main(String[] args) {
		
		//1번
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//2번
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 기호를 입력하세요>> ");
		char symbol = sc.next().charAt(0);
		
//		String sym = sc.next();
//		char symbol = sym.charAt(0);
		
		System.out.print("원하는 횟수를 입력하세요>> ");
		int times = sc.nextInt();
		
		for (int i = 0; i < times; i++) {
			System.out.print(symbol);
		}
		System.out.println();
		
		
		//3번
		int count = 0;
		
		while (true) {
			System.out.print("1)증가, 2)감소, 3)종료 를 선택해주세요.>> ");
			int answer = sc.nextInt();
			if (answer == 1) {
				count++;
				System.out.println("카운트: " + count);
			} else if (answer == 2) {
				count--;
				System.out.println("카운트: " + count);
			} else if (answer == 3) {
				System.out.println("시스템을 종료합니다. 현재까지의 카운트는 " + count);
				break;
			} else {
				System.out.println("1~3의 정수만 입력해주세요.");
			} 
		}
		sc.close();
		

	}

}
