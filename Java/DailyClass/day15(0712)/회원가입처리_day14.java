package db;

import java.sql.SQLException;
import java.util.Scanner;

public class 회원가입처리_day14 {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입할 ID, PW, 이름, 전화번호 입력 >> ");
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();

		MemberDB db = new MemberDB();

		db.create(id, pw, name, tel);

		sc.close();

	}
}
