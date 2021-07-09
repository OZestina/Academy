package 클래스사용;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DB연결 {

	//DB작업
	//1. DB, 테이블 생성
	//2. 데이터 조작(CRUD-Create,Read,Update,Delete)
	
	String ip = "localhost";	//localhost로 하면 자동으로 잡아줌
								//아니면 자기 자신을 가리키는 127.0.0.1 입력
	String port = "3306";
	String user = "root";
	String pass = "1234";
	String table = "member";
	
	public void login(String id, String pw) {
		//회원가입 시 사용한 id가 apple, pw가 1111인 경우
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
	}
	
	public void create(String id, String pw, String name, String tel) throws ClassNotFoundException, SQLException {
		System.out.println(ip+port+"에 연결됐습니다.");
		System.out.println("도착한 id는 "+id);
		System.out.println("도착한 pw는 "+pw);
		System.out.println("도착한 name는 "+name);
		System.out.println("도착한 tel는 "+tel);
		System.out.println("회원가입 처리");
		
//		Java와 MySQL과의 연결 순서는 정해져 있다 (JDBC 프로그래밍)
//		> Java DB Connectivity
		
//		1) connector 설정
		Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("1.커넥터 설정 성공!");
	    
//	    2) MySQL server의 DB와 연결하고 승인을 받자
	    String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
	    DriverManager.getConnection(url,user, pass);
	    System.out.println("2. MySQL 서버 승인/연결 성공!");
	    
	    
//	    3) (승인 후) SQL을 만들자
//	    4) SQL을 MySQL server에 전송
	    
	    
	}
	
	public void read(String id) {
		System.out.println("회원정보 검색 처리");
		
	}
	
	public void update() {
		System.out.println("회원정보 수정 처리");
		
	}
	
	public void delete(String id) {
		System.out.println("회원 탈퇴 처리");
		JOptionPane.showMessageDialog(null, id+"님의 탈퇴 처리가 완료됐습니다.");
	}
	
}
