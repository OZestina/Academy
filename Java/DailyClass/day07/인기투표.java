package 문제풀이;

import javax.swing.JOptionPane;

public class 인기투표 {

	public static void main(String[] args) {

		int opt1 = 0, opt2 = 0, opt3 = 0;
		String opt11 = "아이유", opt22 = "유재석", opt33 = "BTS";

		for (int i = 0; i < 10; i++) {

			String resp = JOptionPane.showInputDialog("당신의 최고 연예인은? (1:아이유, 2:유재석, 3:BTS, 4:종료)");

			if (resp.equals("4")) {
				break;
			}

			switch (resp) {
			case "1":
			case "1번":
				opt1++;
				break;
			case "2":
			case "2번":
				opt2++;
				break;
			case "3":
			case "3번":
				opt3++;
				break;

			default:
				JOptionPane.showMessageDialog(null, "1~4의 숫자만 입력해주세요.");
				i--;
				break;
			}// switch
		} // for

//		System.out.println("[투표결과]");
//		System.out.println("아이유: "+opt1);
//		System.out.println("유재석: "+opt2);
//		System.out.println("BTS: "+opt3);

		System.out.println("[투표결과]");
		
		if (opt1 == opt2 && opt2 == opt3) {
			System.out.println("공동 1위: "+opt11+" ("+opt1+"표)");
			System.out.println("공동 1위: "+opt22+" ("+opt2+"표)");
			System.out.println("공동 1위: "+opt33+" ("+opt3+"표)");
			
		} else if (opt1 == opt2) {
			if (opt1>opt3) {
				System.out.println("공동 1위: "+opt11+" ("+opt1+"표)");
				System.out.println("공동 1위: "+opt22+" ("+opt2+"표)");
				System.out.println("3위: "+opt33+" ("+opt3+"표)");
			} else {
				System.out.println("1위: "+opt33+" ("+opt3+"표)");
				System.out.println("공동 2위: "+opt11+" ("+opt1+"표)");
				System.out.println("공동 2위: "+opt22+" ("+opt2+"표)");
			}
		}else if (opt1 == opt3) {
			if (opt1>opt2) {
				System.out.println("공동 1위: "+opt11+" ("+opt1+"표)");
				System.out.println("공동 1위: "+opt33+" ("+opt3+"표)");
				System.out.println("3위: "+opt22+" ("+opt2+"표)");
			} else {
				System.out.println("1위: "+opt22+" ("+opt2+"표)");
				System.out.println("공동 2위: "+opt11+" ("+opt1+"표)");
				System.out.println("공동 2위: "+opt33+" ("+opt3+"표)");
			}
		}else if (opt3 == opt2) {
			if (opt1<opt2) {
				System.out.println("공동 1위: "+opt22+" ("+opt2+"표)");
				System.out.println("공동 1위: "+opt33+" ("+opt3+"표)");
				System.out.println("3위: "+opt11+" ("+opt1+"표)");
			} else {
				System.out.println("1위: "+opt11+" ("+opt1+"표)");
				System.out.println("공동 2위: "+opt22+" ("+opt2+"표)");
				System.out.println("공동 2위: "+opt33+" ("+opt3+"표)");
			}
		} else if (opt1>opt2 && opt1>opt3){
			if (opt2>opt3) {
				System.out.println("1위: "+opt11+" ("+opt1+"표)");
				System.out.println("2위: "+opt22+" ("+opt2+"표)");
				System.out.println("3위: "+opt33+" ("+opt3+"표)");
			} else {
				System.out.println("1위: "+opt11+" ("+opt1+"표)");
				System.out.println("2위: "+opt33+" ("+opt3+"표)");
				System.out.println("3위: "+opt22+" ("+opt2+"표)");
			}
		} else if (opt2>opt1 && opt2>opt3){
			if (opt1>opt3) {
				System.out.println("1위: "+opt22+" ("+opt2+"표)");
				System.out.println("2위: "+opt11+" ("+opt1+"표)");
				System.out.println("3위: "+opt33+" ("+opt3+"표)");
			} else {
				System.out.println("1위: "+opt22+" ("+opt2+"표)");
				System.out.println("2위: "+opt33+" ("+opt3+"표)");
				System.out.println("3위: "+opt11+" ("+opt1+"표)");
			}
		} else {
			if (opt1>opt2) {
				System.out.println("1위: "+opt33+" ("+opt3+"표)");
				System.out.println("2위: "+opt11+" ("+opt1+"표)");
				System.out.println("3위: "+opt22+" ("+opt2+"표)");
			} else {
				System.out.println("1위: "+opt33+" ("+opt3+"표)");
				System.out.println("2위: "+opt22+" ("+opt2+"표)");
				System.out.println("3위: "+opt11+" ("+opt1+"표)");
			}
		}

	}//main

}
