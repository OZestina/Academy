package 문제풀이;

import java.util.Scanner;

public class 문제풀이3 {

	public static void main(String[] args) {
		//Scanner 선언
		Scanner sc = new Scanner(System.in);
		
		//나이
		System.out.print("나이 입력 >>>");
		int age = sc.nextInt();
		System.out.println("내년 나이는 "+(age+1)+"세");
		
		//키
		System.out.print("키를 입력 >>>");
		double height = sc.nextDouble();
		System.out.println("내년 키는 "+(height+10)+"cm");
		
		//저녁
		System.out.print("저녁을 먹었나요? (true/false 입력) >>>");
		boolean dinner = sc.nextBoolean();
		if (dinner) {
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프겠네요");
		}
		
		sc.nextLine();	//dinner에서 눌린 enter를 없애는 목적
		
		//목표
		System.out.print("올해의 목표는? >>>");
		String goal = sc.nextLine();
		System.out.println("올해의 목표는 "+goal+"!!!");

	}

}
