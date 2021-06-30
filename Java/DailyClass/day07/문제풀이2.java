package 문제풀이;

public class 문제풀이2 {

	public static void main(String[] args) {
		
		int sum1 = 0, sum2=0, sum3=0;

		for (int i = 1; i <= 1000; i = i+3) {
			sum1 = sum1+i;
		}
		//더한 값 출력
		System.out.println(sum1);	//167167

		for (int i = 1; i <= 1000; i = i+3) {
			sum2 = sum2+i;
			
			//100을 넘으면 종료
			if (sum2>100) {
				break;
			}
		}
		System.out.println(sum2);	//117
		
		int count = 0;
		for (int i = 1; i <= 1000; i = i+3) {
			//5의 배수는 제외
			if(i%5==0) {
				continue; //이번 횟수는 제외하고 for문은 계속 돈다
			}
			sum3 = sum3+i;
			count++;
			//System.out.println(i+", "+sum); //확인용
			
			//100을 넘으면 종료
			if (sum3>100) {
				break;
			}
		}
		//더한 값 출력
		System.out.println(sum3);	//110
		System.out.println(count);	//8

	}

}
