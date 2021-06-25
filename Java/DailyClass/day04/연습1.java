package 문제풀이;

import javax.swing.JOptionPane;

public class 연습1 {

	public static void main(String[] args) {

		String buy = JOptionPane.showInputDialog("구매항목: 과자/라면/커피");
		String money = JOptionPane.showInputDialog("구매금액 (원)");
		String vip = JOptionPane.showInputDialog("당신은 VIP입니까? yes/no");
		int cost = Integer.parseInt(money);
		
		if (buy.equals("과자")) {
			JOptionPane.showMessageDialog(null, "과자를 선택하다니, 어린아이 입맛이군요!");
		} else {

			if (buy.equals("라면")) {
				JOptionPane.showMessageDialog(null, "라면을 선택하신 당신, 성인이군요!");
			} else {
				JOptionPane.showMessageDialog(null, "과자도, 커피도 아닌 뭔가를 샀군요!");
			}
		} // end of if문

		if (vip.equals("yes") || vip.equals("y")) {
			JOptionPane.showMessageDialog(null, "VIP님, 할인이 적용되어 총 " + (cost - 1000) + "원 입니다.");
		} else {
			JOptionPane.showMessageDialog(null, "총 금액은 " + money + "원 입니다.");
		}

	} // main

}
