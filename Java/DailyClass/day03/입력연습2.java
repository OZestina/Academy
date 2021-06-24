package 순차문;

import javax.swing.JOptionPane;

public class 입력연습2 {

	public static void main(String[] args) {
		
		String date = JOptionPane.showInputDialog("오늘은 몇요일인가요?");
		String weather = JOptionPane.showInputDialog("오늘의 날씨는 어떤가요?");
		JOptionPane.showMessageDialog(null, date+"은 "+weather);


	}

}
