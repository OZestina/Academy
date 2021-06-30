package 문제풀이;

import java.util.Scanner;

public class 문제풀이4 {

	public static void main(String[] args) {
		// Scanner 선언
		Scanner sc = new Scanner(System.in);

		// 점수 입력
		System.out.print("안정성 점수(30%): ");
		int score1 = sc.nextInt();
		System.out.print("속도 점수(50%): ");
		int score2 = sc.nextInt();
		System.out.print("연비 점수(20%): ");
		int score3 = sc.nextInt();

		// 점수 계산
		double result = (score1 * 0.3) + (score2 * 0.5) + (score3 * 0.2);

		// 점수 출력
		System.out.println("----------------------");
		if (result >= 90) {
			System.out.println(result + "점 최우수입니다.");
		} else if (result >= 80) {
			System.out.println(result + "점 우수입니다.");
		} else if (result >= 70) {
			System.out.println(result + "점 보통입니다.");
		}else {
			System.out.println(result + "점 미달입니다.");
		}//if
		
	}//main
}