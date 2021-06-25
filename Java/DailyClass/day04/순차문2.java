package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 입력

//		String date = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");

		// 처리
		int yes = 28; // 어제의 온도
//		int temp2 = Integer.parseInt(temp);
		double temp3 = Double.parseDouble(temp);
		
//		int result = yes - temp2;
		double result2 = yes - temp3;

		// 출력
//		JOptionPane.showMessageDialog(null, sentence);
//		System.out.println("어제와" + result + "도 차이가 나요");
		System.out.println("어제와" + result2 + "도 차이가 나요");

	} // main

} // class
