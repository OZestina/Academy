// 2021.07.29 updated

package cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CartDAO {
	
	public int cartCreate(CartDTO cart) {
		int result = 0;
		try {
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결
			String url = "jdbc:mysql://localhost:3306/bairbnb";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. BAIRBNB db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "insert into cart values (null, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cart.getBuyerid());
			ps.setInt(2, cart.getProid());
			ps.setString(3, cart.getCcheckin());
			ps.setString(4, cart.getCcheckout());
			ps.setInt(5, cart.getCartprice());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);	//확인용
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}
		return result;
	}
	
	public ArrayList<CartDTO> cartRead(String buyerid) {
		
		ArrayList<CartDTO> result = new ArrayList<CartDTO>();
		
		try {
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결
			String url = "jdbc:mysql://localhost:3306/bairbnb";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. BAIRBNB db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "select * from cart where buyerid = ? order by cartidx asc";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, buyerid);
			System.out.println("3. SQL문 생성 완료");
			
			// 4. sql문을 mysql로 전송한다.
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
						
			while (rs.next()) {
				result.add(new CartDTO(rs.getInt(1), buyerid, rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
				System.out.println("read완료");
			}
									
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}
		
		return result;
		
	}
		
	public int cartUpdate(CartDTO cart) {
		int result = 0;
		try {
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결
			String url = "jdbc:mysql://localhost:3306/bairbnb";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. BAIRBNB db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "update cart set ccheckin = ?, ccheckout = ?, cartprice = ? where cartidx = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cart.getCcheckin());
			ps.setString(2, cart.getCcheckout());
			ps.setInt(3, cart.getCartprice());
			ps.setInt(4, cart.getCartidx());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);	//확인용
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}
		return result;
	}
	
	
	//결제 시 카트 초기화
	public int cartDelete(String buyerid) {
		
		int result = 0;
		try {
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결
			String url = "jdbc:mysql://localhost:3306/bairbnb";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. BAIRBNB db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "delete from cart where buyerid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, buyerid);
			System.out.println("3. SQL문 생성 완료");
			
			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송");
											
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}
		return result;
	}
	
	//장바구니 내 카트 선택 삭제
		public int cartDelete(int cartidx) {
			int result = 0;
			try {
				// 1. jdbc connector설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. connector연결 성공!!!");
				// 2. java에서 db로 연결
				String url = "jdbc:mysql://localhost:3306/bairbnb";
				String username = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, username, password);
				System.out.println("2. BAIRBNB db연결 성공!!!");
				// 3. sql문을 만든다.
				String sql = "delete from cart where cartidx = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, cartidx);
				System.out.println("3. SQL문 생성 완료");
				
				// 4. sql문을 mysql로 전송한다.
				result = ps.executeUpdate();
				System.out.println("4. sql문 전송 전송");
												
			} catch (ClassNotFoundException e) {
				System.out.println("1번에러>> 드라이버없음");
			} catch (SQLException e) {
				System.out.println("2~4번에러>> DB관련 에러");
			}
			return result;
		}
	

}
