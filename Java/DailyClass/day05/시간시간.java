package 문제풀이;

import java.util.Date;

public class 시간시간 {

	public static void main(String[] args) {

		Date today = new Date();

		// 시간 구하기
		int hour = today.getHours();
		if (hour < 10) {
			System.out.println("Good morning");
		} else if (hour < 15) {
			System.out.println("Good afternoon");
		} else if (hour < 20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}

		// 요일 구하기
		int day = today.getDay();
		if (day == 0 || day == 1) {
			System.out.println("쉬세요");
		} else {
			System.out.println("달리세요");
		}

		// 월-계절 구하기
		int month = today.getMonth();
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("지금은 봄이에요");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("지금은 여름이에요");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("지금은 가을이에요");
		} else {
			System.out.println("지금은 겨울이에요");
		}

	}
}
