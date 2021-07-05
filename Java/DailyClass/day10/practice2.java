package 복습;

import java.util.Random;

public class practice2 {
	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		int start = 200;
		for (int i = 0; i < 10; i++) {
			start += r.nextInt(10);
			System.out.println("옮겨진 위치는 "+start+"입니다.");
			Thread.sleep(500);
		}

	}
}
