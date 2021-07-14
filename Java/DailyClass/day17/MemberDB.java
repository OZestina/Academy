package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class MemberDB {
	//자바에서 DB처리할 때는 DML중심으로 클래스를 만든다.
	//DB를 연결할 때는 DB를 단위로 연결한다.
	//DB를 연결하여 데이터 처리를 하는 클래스를 만들 때는 테이블 단위로 만든다
	//테이블(entity, 개체)
	//create(insert~into values)
	
	public int create(String id, String pw, String name, String tel) throws Exception {
		//JDBC(Java DB Connectivity) 자바와 DB를 연결하는 프로그램
		//1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/homeshopping";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. homeshopping DB 연결 성공!");
		
		//3.SQL문을 만든다.
		//PrepareStatement: SQL을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 있으면 됨.
		//ps부품을 2eksr
		String sql = "insert into member values(?,?,?,?)";
		//ps부품을 2단계에서 획득한 con 부붚이 만들어서 return.
		PreparedStatement ps = con.prepareStatement(sql);
		
		//?의 인덱스에 해당하는 값을 넣어주는 함수
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		System.out.println("3. SQL문 생성 완료");
//		String url = "http://www.naver.com";
//		URL u = new URL(url);
//		String file = "c:/temp/test.txt";
//		File f = new File(file);
		
		//4.SQL문을 MySQL로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println(result);
		return result;
	}//end of create
	
	public int update(String id, String opt, String change) throws Exception {
		//1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/homeshopping";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. homeshopping DB 연결 성공!");
		
		//3.SQL문을 만든다.
		//PrepareStatement
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
	
	public int delete(String id) throws Exception {
		//1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!");
		
		//2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/homeshopping";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("2. homeshopping DB 연결 성공!");
		
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
