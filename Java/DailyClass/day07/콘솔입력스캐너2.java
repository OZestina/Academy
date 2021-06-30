package 문제풀이;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력 >>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력 >>> ");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("두 수가 같습니다.");
		} else if (num1 > num2) {
			System.out.println("앞 숫자가 큽니다.");
		} else {
			System.out.println("뒷 숫자가 큽니다.");
		}
		System.out.println("n1: " + num1);
		System.out.println("n2: " + num2);

		System.out.print("당신이 좋아하는 과목은?(자바, c++, python)>>> ");
		String name = sc.next();
		if (name.equals("자바")) {
			System.out.println("JSP로 점프");
		} else if (name.equals("c++")) {
			System.out.println("ASP로 점프");
		} else if (name.equals("python")) {
			System.out.println("장고로 점프");
		} else {
			System.out.println("무조건 열심히!!");
		}

	}

}
