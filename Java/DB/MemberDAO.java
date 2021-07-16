package project_bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


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
	public int update(String memid, String[] memarr) throws Exception {
		//1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. bookstore DB 연결 성공!");
		
		//3.SQL문을 만든다. (pw, name, tel, addr)
		int result = 0;
		
		if (!memarr[0].equals("")) {
			String sql = "update member set pw = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memarr[0]);
			ps.setString(2, memid);			
			result += ps.executeUpdate();
		}
		if (!memarr[1].equals("")) {
			String sql = "update member set name = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memarr[1]);
			ps.setString(2, memid);			
			result += ps.executeUpdate();
		}
		if (!memarr[2].equals("")) {
			String sql = "update member set tel = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memarr[2]);
			ps.setString(2, memid);			
			result += ps.executeUpdate();
		}
		if (!memarr[3].equals("")) {
			String sql = "update member set addr = ? where memid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memarr[3]);
			ps.setString(2, memid);			
			result += ps.executeUpdate();
		}
//		System.out.println("3. SQL문 생성 완료");
//		System.out.println("4. SQL문 전송 완료");
//		System.out.println(result);
		return result;
	}//end of update
	
//	//회원정보 수정
//	public int update(String id, String opt, String change) throws Exception {
//		//1. JDBC connector 설정
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1. connector 연결 성공!");
//		
//		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
//		String url = "jdbc:mysql://localhost:3306/bookstore";
//		String username = "root";
//		String password = "1234";
//		Connection con = DriverManager.getConnection(url,username,password);
//		System.out.println("2. bookstore DB 연결 성공!");
//		
//		//3.SQL문을 만든다.
//		String sql = "update member set "+opt+" = ? where memid = ?";
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, change);
//		ps.setString(2, id);
//		System.out.println("3. SQL문 생성 완료");
//		
//		//4.SQL문을 MySQL로 전송한다.
//		int result = ps.executeUpdate();
//		System.out.println("4. SQL문 전송 완료");
//		System.out.println(result);
//		return result;
//	}//end of update
	
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
	
	public String[] read(String memid) throws Exception {
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
		String sql = "select * from member where memid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memid);
		System.out.println("3. SQL문 생성 완료");
		
		//4.SQL문을 MySQL로 전송한다.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 완료");
		//System.out.println(rs.next());	// record 값이 있는지 확인, 한 번만 써야한다!!!!!!!!
		
		String[] result = new String[5];
		if (rs.next()) {//if (true): 테이블에 검색 결과가 있다면!
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel= rs.getString(4);
			String addr= rs.getString(5);
			System.out.println(id+" "+pw+" "+name+" "+tel+" "+addr);
			result[0] = id;
			result[1] = pw;
			result[2] = name;
			result[3] = tel;
			result[4] = addr;
		}
		
		return result;
	}//end of delete

}//end of class
