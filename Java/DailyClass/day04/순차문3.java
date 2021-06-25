package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {

		// 숫자 입력
		String num1 = JOptionPane.showInputDialog("숫자1을 입력하세요");
		String num2 = JOptionPane.showInputDialog("숫자2를 입력하세요");

		// 정수로 변환
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);

		// 출력
		System.out.println(num1 + "+" + num2 + "=" + (number1 + number2));
		System.out.println(num1 + "-" + num2 + "=" + (number1 - number2));

	}

}
