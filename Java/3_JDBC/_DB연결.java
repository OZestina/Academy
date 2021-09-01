//1) 네트워크 연결할 MySQL server 정보: 주소와 연결 - ip, port
//2) 연결할 MySQL server에 승인을 받아야 함 - id, pw 필요

//Java와 MySQL과의 연결 순서는 정해져 있다 (JDBC 프로그래밍)
// > Java DB Connectivity
//  1) connector 설정
//  2) MySQL server의 DB와 연결하고 승인을 받자
//  3) (승인 후) SQL을 만들자
//  4) SQL을 MySQL server에 전송

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	//자바에서 DB처리할 때는 DML중심으로 클래스를 만든다.
	//DB를 연결할 때는 DB를 단위로 연결한다.
	//DB를 연결하여 데이터 처리를 하는 클래스를 만들 때는 테이블 단위로 만든다
	//테이블(entity, 개체)
	
      //메서드 간 사용을 위해 전역변수로 선언
      Connection con;

      //중복되는 1,2의 경우 생성자를 사용하여 중복을 최소화한다
	public MemberDAO() {
		try {
                  //1. JDBC connector 설정
			//Class.forName("com.mysql.cj.jdbc.Driver");	//mac
			Class.forName("com.mysql.jdbc.Driver");		//window
                  System.out.println("1. connector 연결 성공!");
                  
                  //2. Java에서 DB로 연결. 필요한 정보: 연결할 주소 Url (ip, port, DB명), username, password
                  //String url = "jdbc:mysql://" + ip + ":" + port + "/shoes"
			String url = "jdbc:mysql://localhost:3306/shoes";
			String user = "root";
			String password = "1234";						
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shoes DB 연결 성공!");
                  
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}
	}

      
      //insert into (table) values(value)
	public void create(String id, String pw, String name, String tel) throws Exception {
				
		//3.SQL문을 만든다.
		//PrepareStatement: SQL을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 있으면 됨.
		String sql = "insert into member values(?,?,?,?)";
		//ps부품을 2단계에서 획득한 con 부품이 만들어서 return.
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
	}//end of create
      
	
      //update (table) set (column) = (value) (where column = value)
	public void update(String id, String tel) throws Exception {
		//3.SQL문을 만든다.
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. SQL문 생성 완료");
		
		//4.SQL문을 MySQL로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println(result);
	}//end of update
	
      
      //delete from (table) where (column = *)
	public void delete(String id) throws Exception {
		//3.SQL문을 만든다.
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 완료");
		
		//4.SQL문을 MySQL로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. SQL문 전송 완료");
		System.out.println(result);
	}//end of delete
      
      
      // select (*) from (table) (where column = value)
      public String[] read(String memid) throws Exception {
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
	}//end of read

}//end of class
