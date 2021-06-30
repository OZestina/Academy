package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		//1~10의 수를 더해봅시다
		int sum = 0;	//결과를 저장할 변수
		for (int i = 1; i <= 10000; i++) {
			sum += i;
			//System.out.println(i+"번째 더한 값: "+sum);
		}
		System.out.println("result: " + sum);

	}

}
