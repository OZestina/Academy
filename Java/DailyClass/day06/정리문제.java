package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {

		String food = "떡볶이";

		switch (food) {
		case "떡볶이":
			System.out.println("분식집으로");
			break;
		case "짜장면":
			System.out.println("중국집으로");
			break;
		case "우동":
		case "라멘":
			System.out.println("일식집으로");
			break;
		default:
			System.out.println("집에서 머겅");
			break;
		}

		String sn = "980201-1037514";
		char gender = sn.charAt(7);
		// switch
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남성입니다.");
			break;

		case '2':
		case '4':
			System.out.println("여성입니다.");
			break;
		default:
			System.out.println("외국인입니다.");
		}
		// if
		if (gender == '1' || gender == '3') {
			System.out.println("남성입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여성입니다.");
		} else {
			System.out.println("외국인입니다.");
		}

	}// main

}
