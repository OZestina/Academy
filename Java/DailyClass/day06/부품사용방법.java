package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 자주 사용하여 RAM에 이미 들어가 있음
		// 클래스 이름으로 바로 사용 가능
		// Integer, Double, JOptionPane, System
		// 기능을 가진 부품을 선택, 선택의 기준은 기능을 가지고 있는 지 여부
		// 함수를 가지고 있는 부품을 선택

		// 벽돌
		// cpu는 모든 부퓸을 RAM에 가져다 놓고 조립
		// 복사한 클래스를 RAM에 저장하여 사용하는 것

//		Scanner sc = new Scanner(System.in);	//Console 입력_괄호 안에 input 옵션값 지정 필요 (System.in=>키보드 입력)
//		Random random = new Random();
		Date date = new Date();
		// 1) Date date; //선언(RAM에 저장공간을 만드는 것): (유형) (변수명) (;)
		// 2) date = new Date();

		int hour = date.getHours(); // 10
		System.out.println("현재 시각은 " + hour + "시");

		// 함수는 반환이 있는 것이 있고 없는 것이 있다
		// 반환을 return이라고 한다
		// 반환이 있는 함수만 print가 가능하다
		System.out.println(date.getMinutes());
//		System.out.println(System.out.println()); // 반환값이 없어서 안됨!

		// 반환이 없는 경우에는 함수 설명에서 반환값이 void라고 써있다

		int month = date.getMonth() + 1;
		String season = "해당 계절이 없습니다.";
		if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		} else {
			season = "겨울";
		}
		System.out.println("지금은 " + season + "입니다.");

		System.out.println("================================================");

		// if문에는 자체 break가 있어서,
		// 한 조건을 만족하면 하단의 코드는 읽지 않는다
		int day = date.getDay();
		if (day == 0 || day == 6) {
			System.out.println("주말에는 놀아요");
		} else {
			System.out.println("주중에는 달려요");
		}
		
		
		//switch문
		//정수(int까지), char, String을 인자로 사용
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("It's spring, time of born");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("It's summer, Olaf's favorite season");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("It's autumn, or just fall");
			break;

		default: // else역할
			System.out.println("The winter has come");
			break;
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지입니다.");
			break;
		default:	//없어도 된다
			System.out.println("2월은 해마다 달라질 수 있어요.");
			break;	//없어도 된다 (마지막 항목의 break는 생략 가능)
		}

	}

}
