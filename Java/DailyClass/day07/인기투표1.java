package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		int yes = 0, no = 0;
		for (int i = 0; i < 10; i++) {
			String reponse = JOptionPane.showInputDialog("yo hungry? (yes:1 / no:2)");

			switch (reponse) {
			case "1":
				yes++;
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please input 1 or 2");
				i--;
				break;
			}//switch

		}//for
		
		System.out.println("yes: "+yes+", no: "+no);

	}

}
