package 문제풀이;

import java.util.Random;
import java.util.Scanner;

public class 문제풀이6 {
	public static void main(String[] args) {
		int count;
		int ranNum;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			count = 0;
			ranNum = r.nextInt(100) + 1;
			System.out.println(ranNum); // 숫자 확인용

			while (true) {	//게임 실행
				System.out.print("숫자를 입력하세요: ");
				int num = sc.nextInt();
				count++;

				if (num == ranNum) {
					System.out.println("정답입니다.");
					System.out.println(count + "번 만에 맞췄습니다.");
					break;
				} else if (num > ranNum) {
					System.out.println("더 작은 수를 입력하세요.");
				} else {
					System.out.println("더 큰 수를 입력하세요.");
				}

			}//small_while
			
			System.out.print("게임을 다시 하시겠습니까? (1:yes, 2:no) >>> ");
			int again = sc.nextInt();
			
			if (again == 1) {
				System.out.println("\n게임을 다시 시작합니다.");
				continue;
			} else {
				System.out.println("게임을 종료합니다.");
				System.exit(0);	//break;
			}
		} // big_while

	}
}
