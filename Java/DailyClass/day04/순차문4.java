package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		// 입력

		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");

		String id2 = "root"; // 회원가입 시 등록한 id
		String pw2 = "pass"; // 회원가입 시 등록한 pw

		// 기본형 데이터가 아니면 연산자로 비교할 수 없다
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		System.out.println(id.equals(id2) && pw.equals(pw2));
		
		//&&연산자의 경우, 중요한 체크를 할 비교를 첫 번째에 넣는다.
		//첫 번째 비교에서 false가 나오면, 이후의 비교는 실행되지 않는다. => false
		
		//||연산자의 경우, true가 자주 나오는 비교를 첫 번째에 넣는다.
		//첫 번째 비교에서 true가 나오면, 이후의 비교는 실행되지 않는다. => true
		
		if (id.equals(id2) && pw.equals(pw2)) {	//true
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else { //false
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}

	} // main

} // class
