package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		//사원번호 입력
		String empNum = JOptionPane.showInputDialog("사원번호를 입력하세요.");
		//첫 번째, 두 번째 문자 추출
		char department = empNum.charAt(0);
		char position = empNum.charAt(1);

		//부서(첫 번째 문자) 확인
		switch (department) {
		case '기':
			System.out.print("기획부_");
			break;
		case '인':
			System.out.print("인사부_");
			break;
		case '개':
			System.out.print("개발부_");
			break;
		default:
			System.out.println("부서 정보 없음");
			break;
		}
		//직급(두 번째 문자) 확인
		switch (position) {
		case '1':
		case '2':
			System.out.println("임원");
			break;
		case '3':
			System.out.println("부장");
			break;
		case '4':
		case '5':
			System.out.println("평사원");
			break;
		default:
			System.out.println("해당 직급 없음");
			//break;
		}//switch_position
	}
}
