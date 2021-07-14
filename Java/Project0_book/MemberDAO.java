package project_bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class MemberDAO {
	
	//회원 등록
	public int create(String memid, String pw, String name, String tel, String addr) throws Exception {
		//1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. bookstore DB 연결 성공!");
		
		//3.SQL문을 만든다.
		String sql = "insert into member values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		ps.setString(5, addr);
		System.out.println("3. SQL문 생성 완료");
		
		//4.SQL문을 MySQL로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println(result);
		return result;
	}//end of create
	
	//회원정보 수정
	public int update(String id, String opt, String change) throws Exception {
		//1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. bookstore DB 연결 성공!");
		
		//3.SQL문을 만든다.
		String sql = "update member set "+opt+" = ? where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, change);
		ps.setString(2, id);
		System.out.println("3. SQL문 생성 완료");
		
		//4.SQL문을 MySQL로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println(result);
		return result;
	}//end of update
	
	//회원 탈퇴처리
	public int delete(String id) throws Exception {
		//1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. bookstore DB 연결 성공!");
		
		//3.SQL문을 만든다.
		String sql = "delete from member where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 완료");
		
		//4.SQL문을 MySQL로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println("수행 개수: "+ result);
		return result;
	}//end of delete

}//end of class
