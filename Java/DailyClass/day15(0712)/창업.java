package 메서드반환값;

public class 창업 {

	public static void main(String[] args) {
		
		int 화분_price = 10000;
		int 삽_price = 5000;
		//두 개의 합을 구해보자.
		
		계산기 cal = new 계산기();
		int result = cal.add(화분_price, 삽_price);
		
		int 물조리개_price = 3000;
		int 식물_price = 9000;
		int result2 = cal.add(물조리개_price, 식물_price);
		
		//계산기가 main메서드에게 더한 결과값을 반환한다.
		cal.add(cal.add(화분_price, 삽_price), cal.add(물조리개_price, 식물_price));
		int result3 = cal.add(result, result2);
		
		System.out.println("최종 결제할 금액은 "+result3);
 		
		다양한리턴 var = new 다양한리턴();
		System.out.println(var.add());
		System.out.println(var.add2());
		System.out.println(var.add3());
		System.out.println(var.add4());
		System.out.println(var.add5());
		System.out.println(var.add6());
		
		int[] result7 = var.add7();
		System.out.println(var.add7());
		for (int x : result7) {
			System.out.println(x+" ");
		}
		
		계산기 result8 = var.add8();
		result8.add(100, 200);
		System.out.println(var.add8());

	}

}
