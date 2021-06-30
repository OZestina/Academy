package 문제풀이;

public class 문제풀이1 {
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0, sum3 = 0;

		// 3~222 더하기
		for (int i = 33; i <= 222; i++) {
			sum1 += i;
			//System.out.println(i+", "+sum1); //확인용 print
		}
		System.out.println(sum1);
		
		// 55~4500, 2씩 점프 더하기
		for (int i = 55; i <= 4500; i += 2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		// 0~6000, 5씩 점프 더하기
		for (int i = 0; i <= 6000; i = i+5) {
			sum3 += i;
		}
		System.out.println(sum3);
	}

}
