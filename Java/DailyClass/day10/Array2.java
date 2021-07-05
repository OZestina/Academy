package 문제풀이;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		String[] arr = new String[3];
//		System.out.println(arr[0]);	//String 배열은 null로 초기화
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("프로그래밍 언어를 입력하세요>> ");
			arr[i] = sc.next();
			
		}

		System.out.println(arr[0]+" 보다는 "+arr[1]);
		sc.close();	//stream(연결통로)을 닫아라.		
	}

}
