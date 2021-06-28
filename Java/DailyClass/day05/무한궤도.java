package 문제풀이;

import javax.swing.JOptionPane;

public class 무한궤도 {

	public static void main(String[] args) {

		// 무한루프 생성
		while (true) {

			// 게임 계속 진행 여부 입력
			String again = JOptionPane.showInputDialog("게임을 계속하시겠습니까?(0:계속, 1:종료");
	
			// 진행여부 String->int 변환
			int newGame = Integer.parseInt(again);

			// 입력한 값에 따른 프로그램 진행 결정
			if (newGame == 1) {// 게임 종료 시
				JOptionPane.showMessageDialog(null, "게임을 종료합니다.");
				break;
			} else if (newGame == 0) {// 게임 진행 시
				JOptionPane.showMessageDialog(null, "게임을 시작합니다.");
			}
			
			// 두 개의 수 입력
			String n1 = JOptionPane.showInputDialog("첫 번째 플레이어 숫자 입력");
			String n2 = JOptionPane.showInputDialog("두 번째 플레이어 숫자 입력");

			// 입력받은 수 String->int 변환
			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(n2);

			// 두 개의 수에 따른 게임 결과 반환
			if (num1 > num2) {
				JOptionPane.showMessageDialog(null, "첫 번째 플레이어 승리!");
			} else if (num2 > num1) {
				JOptionPane.showMessageDialog(null, "두 번째 플레이어 승리!");
			} else {
				JOptionPane.showMessageDialog(null, "비겼습니다.");
			}

		}//while

	}//main
	
}//class
