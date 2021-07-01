package 배열생성;

public class 연습문제 {

	public static void main(String[] args) {

		//1) 배열 생성
		int[] arr = new int[5];
		//2) 배열 크기 프린트
		System.out.println(arr.length);
		//3) 배열 첫번째 자리에 100 넣고 프린트
		arr[0]=100;
		System.out.println("arr[0]: "+arr[0]);
		//4) 배열 마지막에 500 넣고 프린트
		arr[4] = 500;
		System.out.println(arr[4]);
		//arr[arr.length-1] = 500;
		//System.out.println("arr[4]: "+arr[arr.length-1]);
		
		//5) 배열의 세 번째 위치에 200 넣고 프린트
		arr[2] = 200;
		System.out.println("arr[2]: "+arr[2]);
		//6) 배열 전체 데이터 프린트
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//7) 배열 전체 데이터 프린트, 근데 인덱스를 넣어서...
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+":"+arr[i]+" ");
		}
		//8)그림으로 그리기
		
	}
}
