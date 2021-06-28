package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			// 입력
			String score1 = JOptionPane.showInputDialog("점수를 입력해주세요: ");
			int score = Integer.parseInt(score1);

			// 처리
			String result1 = null;
			// 처음에 공간을 할당할 때 쓰레기값이 들어있는 공간이 할당이 됨.
			// 쓰레기 값은 프린트도 안되고, 연산도 불가능하다
			// 공간을 깨끗하게 하는 작업을 초기에 해두는 것이 좋다. => 변수의 초기화 (initialize)

			if (score >= 90) {
				result1 = "A학점";
			} else if (score >= 80) {
				result1 = "B학점";
			} else if (score >= 70) {
				result1 = "C학점";
			} else {
				result1 = "D학점";
			}

			// 출력
			System.out.println(result1 + "입니다.");

		} // for

	} // main

} // class
