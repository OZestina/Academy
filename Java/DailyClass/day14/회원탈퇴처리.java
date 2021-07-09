package 클래스생성;

import javax.swing.JOptionPane;

import 클래스사용.DB연결;

public class 회원탈퇴처리 {

	public static void main(String[] args) {
		
		DB연결 db = new DB연결();
		
		String id = JOptionPane.showInputDialog("탈퇴할 id를 입력하세요");
		
		db.delete(id);

	}

}
