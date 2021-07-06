package 배열응용;

import java.util.Random;

public class TOEIC {

	public static void main(String[] args) {
		//문제 수 상수화
		final int QUESTION = 1000;
		
		//답안 저장을 위한 배열 생성
		int[] myAnswer = new int[QUESTION];	//내 답
		int[] answer = new int[QUESTION];	//정답
				
		//점수 카운팅을 위한 변수 선언
		int score = 0;
		int higher=0;
		String idx = null;
		
		//랜덤 함수 사용을 위한 선언
		Random r = new Random();
		
		System.out.println("번호 : 답안 <-> 내답");
		
		//랜덤 넘버 생성&대입, 점수 채점
		for (int i = 0; i < QUESTION; i++) {
			myAnswer[i] = r.nextInt(4)+1;	//1~4 랜덤 넘버 생성 및 대입
			answer[i] = r.nextInt(4)+1;
			
			if(i<10) {
				idx = "  "+i;
			}else if(i<100) {
				idx = " "+i;
			}else {
				idx = idx.valueOf(i);
			}
			
			System.out.println(idx+":  "+answer[i]+"  <->  "+myAnswer[i]);
			
			if (myAnswer[i] == answer[i]) {
				score++;
			}else if(myAnswer[i] > answer[i]) {
				higher++;
			}
		}
		
		System.out.println("당신의 토익 점수는 "+score+"입니다.");
		System.out.println("답지보다 높은 답은 "+higher+"입니다.");
		

	}

}
