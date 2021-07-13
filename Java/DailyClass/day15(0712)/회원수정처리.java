package db;

import java.util.Scanner;

public class 회원수정처리 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("회원ID, 덮어쓸 tel >> ");
		String id = sc.next();
		String tel = sc.next();

		MemberDB db = new MemberDB();

		db.update(id,tel);

		sc.close();
	}

}
