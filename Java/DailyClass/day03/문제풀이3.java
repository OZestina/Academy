package 문제풀이;

public class 문제풀이3 {

	public static void main(String[] args) {

		int waterPrice = 1000;
		int waterAmount = 2;
		int maskPrice = 2000;
		int maskAmount = 3;
		int water = waterAmount * waterPrice;
		int mask = maskAmount * maskPrice;

		System.out.println("생수 가격은 " + water + "원입니다.");
		System.out.println("마스크 가격은 " + mask + "원입니다.");
		System.out.println("총 금액은 " + (water + mask) + "원입니다.");

	}

}
