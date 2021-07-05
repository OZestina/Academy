package 복습;

import java.util.Random;

public class 랜덤1000개 {

	public static void main(String[] args) {

		int[] score = new int[100];
		//변수 개수: 1002개
		//램의 크기: 
		System.out.println(score.length+"개");
		System.out.println(score);
		//기본형 변수의 개수: 1001개 (1000+length)
		//참조형 변수의 개수: 1개
		
		Random r = new Random(42);
		System.out.println(r.nextInt(1000));	//return값이 있어 print 가능
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(100);
		}
		
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i]+" ");
//		}
//		System.out.println();
//		
//		for (int i : score) {				//foreach
//			System.out.print(i+" ");
//		}
		
		
		
	}

}
