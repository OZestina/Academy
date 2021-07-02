package 배열사용;

import java.util.Scanner;

public class 인기투표101 {

	public static void main(String[] args) {
		// console 입력을 위한 Scanner 선언
		Scanner sc = new Scanner(System.in);

		// 투표 옵션 리스트 생성
		String[] name = { "아이유", "유재석", "BTS" };
		// 투표 수를 계산할 배열 생성
		int[] votes = new int[3];
		// 총 투표 수 계산용 변수
		int total = 0;

		// 투표 기능
		while (true) {
			System.out.println("인기투표 1)아이유 2)유재석 3)BTS ... 4)종료");
			System.out.print("선택번호>> ");
			int v = sc.nextInt();

			if (v == 1) {
				votes[v - 1]++;
				total++;
				System.out.println(name[v - 1] + "이/가 한 표 획득");
				System.out.println();
			} else if (v == 2) {
				votes[v - 1]++;
				total++;
				System.out.println(name[v - 1] + "이/가 한 표 획득");
				System.out.println();
			} else if (v == 3) {
				votes[v - 1]++;
				total++;
				System.out.println(name[v - 1] + "이/가 한 표 획득");
				System.out.println();
			} else if (v == 4) {
				System.out.println("투표를 종료합니다.");
				System.out.println();
				break;
			} else {
				System.out.println("1~4의 정수만 입력해주세요.");
				System.out.println();
			}
		}
		
		// 투표 종료 후 결과 출력 
		System.out.println("[투표결과]");
		for (int i = 0; i < votes.length; i++) {
			System.out.println(name[i] + ": " + votes[i] + "표");
		}
		System.out.println("전체 투표 수: " + total + "회");

	}//main

}
