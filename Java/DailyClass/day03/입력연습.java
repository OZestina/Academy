package 순차문;

import javax.swing.JOptionPane;

public class 입력연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		System.out.println(name+"님, 안녕히가세요.");
		JOptionPane.showMessageDialog(null, name+"님 안녕히가세요.");
		
		String roomNo = JOptionPane.showInputDialog("당신이 있는 강의실 호수는?");
		System.out.println("당신은 "+roomNo+"호에 있습니다.");
		
		String menu = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
		System.out.println("당신은 "+menu+"을/를 먹는군요.");
	
		
	}

}
