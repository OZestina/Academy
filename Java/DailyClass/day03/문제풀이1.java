package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		
		int coffee = 5;			// 커피 5잔
		int price = 5000;		// 한 잔에 5000원
		int total = coffee * price;	//총 가격 계산
		
		if (total>20000) {
			JOptionPane.showMessageDialog(null, "할인해드릴게요!");
		} else {
			JOptionPane.showMessageDialog(null, "총 " + total + "원입니다.");
		}

	}

}
