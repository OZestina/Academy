package 클래스생성;

import javax.swing.JOptionPane;

import 클래스사용.DB연결;

public class 회원로그인처리 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		DB연결 db = new DB연결();
		
		db.login(id, pw);

	}

}
