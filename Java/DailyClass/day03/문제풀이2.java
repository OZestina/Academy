package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		
		int currentAge = 100;
		
		// 내년 나이 계산 및 출력
		int nextAge = currentAge + 1;
		System.out.println("나는 내년에 "+nextAge+"살이 됩니다.");
		
		if (nextAge>100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작 (●'◡'●)");
		} else {
			JOptionPane.showMessageDialog(null, "아직 젊어요 ╰(*°▽°*)╯");
		}
		
	}

}
