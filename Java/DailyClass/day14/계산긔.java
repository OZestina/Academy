package 클래스생성;

public class 계산긔 {
	
	public void order(String food) {
		System.out.println("당신이 주문한 것은 "+food);
	}
	
	//사칙연산 계산기
	public void add(int n1, int n2) {
		int result = n1+n2;
		System.out.println("덧셈 결과: "+result);
		System.out.println("Addition completed");
	}
	public void sub() {
		System.out.println("Substraction completed");
	}
	public void multi(int price, int count) {
		int result = price*count;
		System.out.println("곱셈 결과: "+result);
		System.out.println("Multiply completed");
	}
	public void div(double d1, double d2) {
		double result = d1/d2;
		System.out.println("나눗셈 결과: "+result);
		System.out.println("Division completed");
	}

}
