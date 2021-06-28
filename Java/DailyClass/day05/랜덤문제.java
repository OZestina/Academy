package 문제풀이;

import java.util.Random;

public class 랜덤문제 {

	public static void main(String[] args) {

		// 랜덤 넘버 2개 발생
		// 첫 번째 넘버가 클 경우 '첫 번째가 더 커요'
		// 두 번째 넘버가 클 경우 '두 번째가 더 커요'

		Random r = new Random();	//랜덤넘버 사용을 위해 Random r 선언
		int n1 = r.nextInt(100) + 1; // 1~100 랜덤넘버 생성
		int n2 = r.nextInt(100) + 1; // 1~100 랜덤넘버 생성

		//랜덤넘버 확인 용 print
		System.out.println(n1);
		System.out.println(n2);
		
		//숫자 비교
		if (n1 > n2) {//n1이 큰 경우
			System.out.println("첫 번째 숫자가 더 커요");
		} else if (n1 < n2) {//n2가 큰 경우
			System.out.println("두 번째 숫자가 더 커요");
		} else {//n1==n2인 경우
			System.out.println("와! 두 수가 같아요 :)");
		} // if문

	}// main

}
