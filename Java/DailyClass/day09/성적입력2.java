package 배열사용;

import java.util.Random;
import java.util.Scanner;

public class 성적입력2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[1000];
		int sum = 0;
		
		//랜덤 넘버로 점수 입력 (1000회)
		for (int i = 0; i < score.length; i++) {
			Random r = new Random();
			score[i] = r.nextInt(101);	//0~100 생성
			
			//System.out.println(score[i]);//랜덤넘버 생성 확인용
		}
		
		//총점 계산
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		//평균값 프린트
		System.out.println("평균 성적은 "+(sum/score.length)+"입니다");
		
	}

}
