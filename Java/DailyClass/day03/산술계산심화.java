package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		System.out.println("두 수의 합은 " + (x+y));
		System.out.println(x+"를 "+y+"로 나누면 그 몫은 " + (x/y));
		
		int sum = x+y;
		int average = sum/2;
		System.out.println("두 수의 평균은 "+average+"입니다.");
		//java에서는 정수와 정수의 계산은 무조건 정수의 결과!

		//대신 하나라도 실수면 무조건 실수의 결과 
		double average2 = sum/2.0;
		System.out.println("두 수의 평균은 "+average2+"입니다.");
		
		int count = 2;
		double average3 = sum/(double)count;
		System.out.println("두 수의 평균은 "+average3+"입니다.");
		
		int x2 = 22;
		double y2 = 22;
		System.out.println("x2: "+x2+", y2: "+y2);
		
	}

}
