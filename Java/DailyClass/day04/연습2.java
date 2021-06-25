package 문제풀이;

public class 연습2 {

	public static void main(String[] args) {
		int score = 88;

		if (score >= 90) {
			System.out.println("학점은 'A' 입니다.");
		} else if (score >= 80) {
			System.out.println("학점은 'B' 입니다.");
		} else if (score >= 70) {
			System.out.println("학점은 'C' 입니다.");
		} else {
			System.out.println("학점은 'D' 입니다. \n다음에는 좀 더 분발하세요");
		}
	}
}
