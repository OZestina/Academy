package 문제풀이;

public class 피라미드 {
	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			
			for(int j = 0; j<4; j++) {
				System.out.print("▣");
			}
			System.out.println();
		}
		
		System.out.println("==============================");

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print('◈');
			}
			System.out.println();
		}
	}
}
