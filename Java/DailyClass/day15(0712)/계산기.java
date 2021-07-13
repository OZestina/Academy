package 메서드반환값;

public class 계산기 {
	//성질: 멤버변수
	//동작: 멤버메서드(*)
	//cal.add(100,200)
	//기능정의, 함수정의, 메서드 정의
	//x,y는 지역변수, add안에서만 사용 가능
	//메서드 사용(호출, call, 콜)
	//메서드 안에서 값을 전달할 목적으로 생성되는 변수
	//매개변수, parameter(파라미터)
	public int add(int x, int y) {
		int result = x+y;
		System.out.println("두 수의 합은 "+result);
		
		//호출한 곳으로 값을 반환할 필요가 있을 때 return값을 넣는다.
		return result;
	}



}
