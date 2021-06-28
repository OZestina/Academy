package 복습.순차문;

import javax.swing.JOptionPane;

public class 입력처리출력 {

	public static void main(String[] args) {
		// 1) 입력
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제 " + hobby + "을/를 하시나요?");
		String time = JOptionPane.showInputDialog("몇 시간이나 " + hobby + "을/를 하시나요?");

		// 2) 처리
		String result = when + "에 " + hobby + "을/를 하시는군요!";
		int time2 = Integer.parseInt(time);

		// 3) 출력

		JOptionPane.showMessageDialog(null, result);
		if (time2 >= 3) {//비교연산자의 결과는 항상 boolean(논리데이터 - true/false)
			JOptionPane.showMessageDialog(null, "아주 많이 하시네요");
		} else {
			JOptionPane.showMessageDialog(null, "보통으로 하시네요");
		}
	}

}
