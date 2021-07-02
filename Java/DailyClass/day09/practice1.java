package practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c1 = 0, c2 = 0, c3 = 0;
		int[] num = new int[2];

		while (true) {

			// 숫자 입력
			System.out.println("숫자 크기 판별");
			System.out.println("---------------");
			System.out.print("첫 번째 숫자 입력>> ");
			num[0] = sc.nextInt();
			System.out.print("두 번째 숫자 입력>> ");
			num[1] = sc.nextInt();
			// 숫자 크기 판별
			if (num[0] > num[1]) {
				System.out.println("판결은 앞숫자가 크다");
				c1++;
			} else if (num[0] < num[1]) {
				System.out.println("판결은 뒷숫자가 크다");
				c2++;
			} else {
				System.out.println("판결은 두 숫자가 같다");
				c3++;
			}

			System.out.print("계속 하시겠습니까(계속:o, 종료:x)>> ");
			while (true) {
				// 게임 반복 확인
				String con = sc.next();
				if (con.equals("o")) {
					System.out.println();
					break;
				} else if (con.equals("x")) {
					System.out.println("프로그램을 종료합니다.\n");
					// 게임 결과 출력
					System.out.println("[결과]");
					System.out.println("총 시도 횟수: " + (c1 + c2 + c3));
					System.out.println("앞 숫자가 큰 횟수: " + c1);
					System.out.println("뒷 숫자가 큰 횟수: " + c2);
					System.out.println("숫자가 같은 횟수: " + c3);
					System.exit(0);
				}
				System.out.print("o와 x로만 입력하세요(계속:o, 종료:x)>> ");
			}

		}

	}

}
