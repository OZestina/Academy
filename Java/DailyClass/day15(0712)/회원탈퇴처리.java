package db;

import java.util.Scanner;

public class 회원탈퇴처리 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("회원탈퇴할 ID >> ");
		String id = sc.next();

		MemberDB db = new MemberDB();

		db.delete(id);

		sc.close();
	}

}
