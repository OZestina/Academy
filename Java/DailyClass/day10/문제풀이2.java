package 문제풀이;

import java.util.Scanner;

public class 문제풀이2 {

	public static void main(String[] args) {
		
		//1번
		int[] score = {100,87,34,52,88};
		int temp = score[2];
		score[2] = score[3];
		score[3] = temp;
		
		for (int i : score) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===============================");
		
		//2번
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("숫자 입력>> ");
			arr[i]= sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("최고 점수는 "+max);
		sc.close();

	}

}
