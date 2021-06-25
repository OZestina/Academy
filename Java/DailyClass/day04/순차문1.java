package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 입력->처리->출력의 순서

		// 입력
		// 모든 입력 데이터는 컴퓨터는 스트링으로 읽어온다.
		// 스트링으로 입력된 데이터를 숫자로 쓸 지, 스트링 그래도 쓸 지는 프로그래머가 결정
		// 숫자로 써야한다면 스트링->숫자로 변환하는 처리(함수사용)를 해야한다.

		String date = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요?");

		// 처리
		String sentence = date + "은 " + temp + "도";

		// 출력
//		JOptionPane.showMessageDialog(null, sentence);
		System.out.println(sentence);
		
		
	} // main

} // class
