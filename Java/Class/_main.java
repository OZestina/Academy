package 클래스생성;

import java.util.Scanner;

import 클래스사용.DB연결;

public class 회원가입처리 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입할 ID, PW, 이름, 전화번호 입력 >> ");
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();
		
		DB연결 db = new DB연결();
		
		db.create(id, pw, name, tel);
		
		sc.close();

	}

}
