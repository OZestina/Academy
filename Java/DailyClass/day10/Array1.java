package 문제풀이;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("숫자를 입력하세요>>");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(arr[0]+"+"+arr[2]+"="+(arr[0]+arr[2]));
		sc.close();

	}

}
