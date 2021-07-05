package 문제풀이;

import java.util.Scanner;

public class 과일 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] fruits = { "사과", "바나나", "포도", "키위" };// 과일 종류 배열
		int[] price = { 2000, 2000, 3000, 3000 }; 		// 각 과일 별 가격
		int[] amount = { 0, 0, 0, 0 }; 					// 구매 개수
		int total = 0; 									// 총 금액 계산용
		int choice;										// 입력값 변수

		while (true) {

			//메뉴(?) 출력
			System.out.println("===============================================");
			System.out.print("좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료 >> ");
			choice = sc.nextInt();
			System.out.println("===============================================");

			//입력값에 따른 실행
			if (choice == 0) {
				System.out.println("프로그램이 종료됩니다.");
				System.out.println();
				break;
			} else if (choice <0 || choice >4) {
				System.out.println("1~4의 수를 입력해주세요 (0은 종료)");
				System.out.println();
			} else {
				System.out.println(fruits[choice-1]+"가 선택되었습니다");
				System.out.println();
				amount[choice - 1]++;
			} 

		} // while

		//프로그램 종료 후 항목 별 개수 및 총 금액 출력 
		for (int i = 0; i < amount.length; i++) {
			System.out.println(fruits[i] + ": " + amount[i] + "개");
			total += price[i] * amount[i];
		}
		System.out.println("구매하려면 전체 금액은 " + total + "원입니다.");
		sc.close();
	}
}
