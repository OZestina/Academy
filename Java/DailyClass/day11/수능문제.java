package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		
		final int FULL = 330;
		
		int[] score = new int[10000];
		Random r = new Random(5);
		for (int i = 0; i < score.length; i++) {
			score[i]=r.nextInt(FULL+1);	//0~330점
		}
		
		//1) 수능 만점자는 총 몇 명?
		
		int highest = 0;
		String list = "";
		
		for (int i = 0; i < score.length; i++) {
			if (score[i]==FULL) {
				highest++;
				list = list + " "+(i+1) +"번";
			}
		}
		System.out.println("만점자는 총 "+highest+"명");
		
		//2) 만점자 번호는 몇 번?
		System.out.print("만점자는"+list +"입니다");	//String에 저장해서 출력
		System.out.println("\n");
		
		System.out.print("만점자는");					//for문으로 출력
		for (int i = 0; i < score.length; i++) {
			if (score[i]==FULL) {
				System.out.print(" "+(i+1)+"번" );
			}
		}
		System.out.println("입니다.");
		

	}

}
