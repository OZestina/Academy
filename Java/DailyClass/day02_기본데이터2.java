package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		
//		색을 저장(r)
//		호실을 저장(709)
//		평균나이를 저장(27.5)
//		----------------------------
//		1.선언
//		2.대입
//		3.출력
//		4.그림
		
		char color;
		int roomNumber;
		double avgAge;
		
		color = 'R';
		roomNumber = 709;
		avgAge = 27.5;
		
		System.out.println("색: " + color);
		System.out.println("장소: " + roomNumber + "호");
		System.out.println("평균 나이: " + avgAge);
		
		color = 'B';
		System.out.println("색: " + color);
		System.out.println("장소: " + roomNumber + avgAge);
		System.out.println(color+avgAge);
		
	}

}
