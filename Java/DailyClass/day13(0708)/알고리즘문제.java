package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 알고리즘문제 {

	public static void main(String[] args) {
		
		//랜덤 선언
		Random r = new Random();
		
		//랜덤넘버 저장할 배열 선언 및 값 대입
		int[] arr = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000)+1;
		}
		
		//1)최소값 찾기: 최소값 변수, 계산
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("최소값: "+min);
		
		//2)개수 세기: 개수 저장용 변수 선언
		int count = 0;
		//3)위치값 찾기: 위치값 저장을 위한 변수
		String location = "";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				count++;
				location += i+"번 ";
			}
		}
		System.out.println("최소값은 총 "+count+"개,");
		System.out.println("위치는 "+location+"입니다.");
		
		
		//파괴함수를 써서 정렬 후 최소값/최대값 찾기
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[arr2.length-1]);

	}

}
