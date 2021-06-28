package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {

		// 목표: 사각형의 넓이를 구하자

		// 가로세로 길이 입력
		String width = JOptionPane.showInputDialog("가로의 길이: ");
		String depth = JOptionPane.showInputDialog("세로의 길이: ");

		// 넓이 계산
		double width1 = Double.parseDouble(width);
		double depth1 = Double.parseDouble(depth);
		double result = width1 * depth1;

		// 넓이 출력
		JOptionPane.showMessageDialog(null, "입력하신 사각형의 넓이는 " + result + "입니다.");
	}

}
