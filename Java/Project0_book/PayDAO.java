package project_bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PayDAO {
	
	static int payid;
	
	//주문
	public int create(String memid, String bookid, int qty) throws Exception {
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
		String sql = "insert into payment values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, payid);
		ps.setString(2, memid);
		ps.setString(3, bookid);
		ps.setInt(4, qty);
		System.out.println("3. SQL문 생성 완료");
		
		//4.SQL문을 MySQL로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println(result);
		
		payid++;
		
		return result;
	}//end of create

}//end of class
