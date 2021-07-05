package 문제풀이;

import java.util.Random;

public class 문제풀이3 {

	public static void main(String[] args) {
		
		Random r = new Random(42);
		int[] score = new int[1000];
		int[] index = new int[10];

		int max = 0;		//최고점수 저장용
		int howMany = 0;	//최고득점자 인원 수 저장용
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(501);	//0~500점
			System.out.print(score[i]+" ");
		}
		System.out.println();
		
		//최고점수 찾기
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max = score[i];
			}
		}
		System.out.println("최고 점수는 "+max+"입니다.");
		
		//최고점수는 몇명일까
		for (int i = 0; i < score.length; i++) {
			if (max == score[i]) {
				index[howMany] = i+1;
				howMany++;
			}
		}
		System.out.println("최고득점자는 총 "+howMany+"명 입니다.");
		
		//몇 번째 있는 사람일까
		System.out.print("최고 득점자는");
		for (int i = 0; i < index.length; i++) {
			if(index[i]!=0) {
				System.out.print(" "+index[i]);
			}
		}
		System.out.println("번째에 있습니다.");

	}

}
