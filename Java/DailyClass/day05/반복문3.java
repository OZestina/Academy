package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {

		// 시작값과 종료값을 입력받기
		// 시작값~종료값 사이의 수를 1씩 증가하면서 프린트

		// 시작값,종료값 입력_int로 변환
		String start1 = JOptionPane.showInputDialog("시작값을 입력하세요: ");
		String end1 = JOptionPane.showInputDialog("종료값을 입력하세요: ");
		int start = Integer.parseInt(start1);
		int end = Integer.parseInt(end1);

		// 프린트용 반복문_for
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}

		// 프린트용 반복문_while
		int i = start;
		while (i <= end) {
			System.out.println(i);
			i++;
		}

		// 프린트용 반복문_while(ver2)
		while (start <= end) {
			System.out.println(start);
			start++;
		}
	} // main

} // class
