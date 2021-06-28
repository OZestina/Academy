package 반복문;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {
	
	public static void main(String[] args) {
		
		int target = 77;
		
		while (true) {
			//숫자 입력 받기
			String num = JOptionPane.showInputDialog("숫자를 입력하세요.");
			
			//숫자로 반환처리
			int number = Integer.parseInt(num);
					
			//정답인지 확인 => 정답이면 프로그램 종료 / 아니면 숫자 입력으로 도돌이
			if(number == target) {
				JOptionPane.showMessageDialog(null, "맞았습니다!");
				//break; //while의 break
				System.exit(0);
			} else if (number>target){
				JOptionPane.showMessageDialog(null, "더 작은 수를 입력하세요");
			} else {
				JOptionPane.showMessageDialog(null, "더 큰 수를 입력하세요");
			}//if
			
		}//while
		//System.out.println("게임이 모두 종료되었습니다.");;
	}//main
	
}//class
