package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		// 입력
		int score = 30;

		// 처리
		String result =null;

		if (score >= 90) {
			result = "A학점";
		} else if (score >= 80) {
			result = "B학점";
		} else if (score >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}

		// 출력
		System.out.println(result);
	}

}
