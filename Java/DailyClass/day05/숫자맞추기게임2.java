package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임2 {

	public static void main(String[] args) {

		Random r = new Random(4);//Random 사용을 위해 한 번만 선언되면 됨
		
		int target = r.nextInt(100)+1; //1~100
		//System.out.println(target); //랜덤넘버 확인용
		
		while (true) {
			// 숫자 입력 받기
			String num = JOptionPane.showInputDialog("숫자를 입력하세요.");

			// 숫자로 반환처리
			int number = Integer.parseInt(num);

			// 정답인지 확인 => 정답이면 프로그램 종료 / 아니면 숫자 입력으로 도돌이
			if (number == target) {
				JOptionPane.showMessageDialog(null, "맞았습니다!");
				// break; //while의 break
				System.exit(0);
			} else if (number > target) {
				JOptionPane.showMessageDialog(null, "더 작은 수를 입력하세요");
			} else {
				JOptionPane.showMessageDialog(null, "더 큰 수를 입력하세요");
			} // if

		} // while

	}// main

}// class
