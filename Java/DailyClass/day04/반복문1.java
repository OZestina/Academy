package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("The earth is spinning");
			String q = JOptionPane.showInputDialog("Wanna stop it?");
			if(q.equals("yes")) {
				//break;	//반복문을 그만하라
				System.exit(0);	//프로그램 종료
			}
		}

	}

}
