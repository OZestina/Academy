package 배열생성;

public class 기본형배열2 {
	
	public static void main(String[] args) {
		
		int[] s = new int[10];
		// int[]: int로 이루어진 배열의 자료형
		// s: 배열의 이름, 힙 영역에 할당된 배열의 주소가 저장
		// =: 대입 연산자 (힙 영역에 할당된 변수의 주소를 변수에 대입) 
		// new: 생성 연산자 (힙 영역에 지정된 타입의 크기만큼 배열을 생성하라)
		// int[10]: 배열의 자료형 및 크기(배열의 길이) 설정
		
		System.out.println(s.length);
		//길이 구하기
		
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < s.length; i++) {
				
				if (j==0) {
					System.out.print((i + 1) + " ");
				}else {
					System.out.print(s[i] + " ");
				}
			} 
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i+1;
			System.out.print(i+":"+s[i]+" ");
		}
		
	
		
	}

}
