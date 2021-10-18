public class 실수처리 {

	public static void main(String[] args) {
		
		double pie = 3.545592;
		System.out.println(Math.round(pie));	//반올림, long 반환
		System.out.println(Math.floor(pie));	//버림, double 반환
		System.out.println(Math.ceil(pie));		//올림, double 반환
		System.out.println(String.format("%.2f", pie)); //소수점 2째 자리까지 출력 (반올림)
		
		System.out.printf("%10d\n",20);			//공간 지정(우측정렬)
		System.out.printf("%.2f\n",11.144);		//소수점 2째 자리까지 출력 (반올림)
		System.out.printf("%s\n","홍킬통");		//String 출력
		
		double rand = Math.random();			//0~1 사이의 랜덤 넘버
		System.out.println(rand);

	}

}
