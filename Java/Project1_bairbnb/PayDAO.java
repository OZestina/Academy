// 2021.07.29 updated
// update 구현 필요한 경우 추가 예정

package pay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import cart.CartDAO;
import cart.CartDTO;

public class PayDAO {

	// 장바구니구매
	public int payCreate(String buyerid) {
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
			PreparedStatement ps = null;

			CartDAO cartDao = new CartDAO();
			ArrayList<CartDTO> cartList = cartDao.cartRead(buyerid);

			for (int i = 0; i < cartList.size(); i++) {
				String sql = "insert into pay values (null, now(), ?, ?, ?, ?, ?)";
				ps = con.prepareStatement(sql);

				ps.setString(1, cartList.get(i).getBuyerid());
				ps.setInt(2, cartList.get(i).getProid());
				ps.setString(3, cartList.get(i).getCcheckin());
				ps.setString(4, cartList.get(i).getCcheckout());
				ps.setInt(5, cartList.get(i).getCartprice());

				// System.out.println(i+"번째 리스트 결제");
				System.out.println("3. sql문 생성 성공!!!");

				// 4. sql문을 mysql로 전송한다.
				result = ps.executeUpdate();
				System.out.println("4. sql문 전송 전송");
				System.out.println(result);

				cartDao.cartDelete(buyerid);
				System.out.println("스케줄러 삭제 완료");
			} // end of for
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		} // end of try&catch
		return result;
	}

	// 바로구매
	public int payCreate(String buyerid, int proid, String checkin, String checkout, int payprice) {
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
			String sql = "insert into pay values (null, now(), ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, buyerid);
			ps.setInt(2, proid);
			ps.setString(3, checkin);
			ps.setString(4, checkout);
			ps.setInt(5, payprice);
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		} // end of try&catch
		return result;
	}

	// 결제정보 확인
	public ArrayList<PayDTO> payRead(String buyerid) {

		ArrayList<PayDTO> result = new ArrayList<PayDTO>();

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
			String sql = "select * from pay where buyerid = ? order by paydate desc";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, buyerid);
			System.out.println("3. SQL문 생성 완료");

			// 4. sql문을 mysql로 전송한다.
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");

			while (rs.next()) {
				result.add(new PayDTO(rs.getInt(1), rs.getString(2), buyerid, 
						rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}//end of try&catch
		return result;
	}

	// update 없어도 될듯
	// public void payUpdate(String buyerid, int cartidx) { }

	 public int payDelete(int payid) {
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
				String sql = "delete from pay where payid = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, payid);
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
