package 배열사용;

import java.util.Scanner;

public class 성적입력 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[1000];
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("성적을 입력하세요>> ");
			score[i] = sc.nextInt();
		}
		
		//총점 계산
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		//평균값 프린트
		System.out.println("평균 성적은 "+(sum/score.length)+"입니다");
		
	}

}
