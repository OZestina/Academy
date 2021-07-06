package 배열응용;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		
		String s = "감자,고구마,양파";
		String s2[] = s.split(",");	//{"감자","고구마","양파"}
		
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[0].equals(s2[1]));
		
		//일,월,화 날씨를 순서대로 입력. (흐림, 맑음, 흐림)
		//흐림이 몇개인지, 맑음이 몇개인지 세어보아요.

		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		
		System.out.print("일, 월, 화요일의 날씨를 입력하세요>> ");
		String weather = sc.next();
		
		System.out.println(weather);
		
		String[] arr = weather.split(",");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("맑음")) {
				count1++;
			} else if (arr[i].equals("흐림")) {
				count2++;
			}
		}
		System.out.println("맑은 날의 수: "+count1);
		System.out.println("흐린 날의 수: "+count2);
		
		sc.close();
	}

}
