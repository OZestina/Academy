// 2021.08.06 updated
// update없음

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

	Connection con;

	public PayDAO() {

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");	//mac
			Class.forName("com.mysql.jdbc.Driver");			//window
			
			String url = "jdbc:mysql://localhost:3306/bairbnb";
			String username = "root";
			String password = "1234";						//주현
			//String password = "cnzk0531";					//혜윤
			con = DriverManager.getConnection(url, username, password);
			System.out.println("2. BAIRBNB db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			System.out.println("1번에러>> 드라이버없음");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}
	}

	// 장바구니구매_선택구매
	public int payCreate(int cartidx) {
		int result = 0;
		try {
			// 3. sql문을 만든다.
			PreparedStatement ps = null;
			CartDAO cartDao = new CartDAO();
			CartDTO pay = cartDao.cartRead(cartidx);
			String sql = "insert into pay values (null, now(), ?, ?, ?, ?, ?)";
				ps = con.prepareStatement(sql);

				ps.setString(1, pay.getMemid());
				ps.setInt(2, pay.getProid());
				ps.setString(3, pay.getCcheckin());
				ps.setString(4, pay.getCcheckout());
				ps.setInt(5, pay.getCartprice());

				System.out.println("3. sql문 생성 성공!!!");

				// 4. sql문을 mysql로 전송한다.
				result = ps.executeUpdate();
				System.out.println("4. sql문 전송 전송");
				System.out.println(result);

				cartDao.cartDelete(cartidx);
				System.out.println("스케줄러 삭제 완료");
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		} // end of try&catch
		return result;
	}

	// 상세페이지 바로구매
	public int payCreate(String memid, int proid, String checkin, String checkout, int payprice) {
		int result = 0;
		try {
			// 3. sql문을 만든다.
			String sql = "insert into pay values (null, now(), ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, memid);
			ps.setInt(2, proid);
			ps.setString(3, checkin);
			ps.setString(4, checkout);
			ps.setInt(5, payprice);
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		} // end of try&catch
		return result;
	}

	// 결제정보 확인
	public ArrayList<PayDTO> payRead(String memid) {

		ArrayList<PayDTO> result = new ArrayList<PayDTO>();

		try {
			// 3. sql문을 만든다.
			String sql = "select * from pay where memid = ? order by checkin asc";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memid);
			System.out.println("3. SQL문 생성 완료");

			// 4. sql문을 mysql로 전송한다.
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");

			while (rs.next()) {
				result.add(new PayDTO(rs.getInt(1), rs.getString(2), memid, rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		} // end of try&catch
		return result;
	}
	
	// 결제된 일정 확인
	public ArrayList<String[]> payRead(int proid) {

		ArrayList<String[]> result = new ArrayList<String[]>();

		try {
			// 3. sql문을 만든다.
			String sql = "select checkin, checkout from pay where proid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, proid);
			System.out.println("3. SQL문 생성 완료");

			// 4. sql문을 mysql로 전송한다.
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");

			while (rs.next()) {
				String[] soldOut = {rs.getString("checkin"), rs.getString("checkout")};
				result.add(soldOut);
			}
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		} // end of try&catch
		return result;
	}
	
	// 판매자의 판매내역 확인
	public ArrayList<PayDTO> sellRead(String proids) {

		ArrayList<PayDTO> result = new ArrayList<PayDTO>();

		try {
			// 3. sql문을 만든다.
			String sql = "select checkin, checkout from pay where "+proids+" order by paydate desc";
			PreparedStatement ps = con.prepareStatement(sql);
			
			System.out.println("3. SQL문 생성 완료");

			// 4. sql문을 mysql로 전송한다.
			ResultSet rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");

			while (rs.next()) {
				result.add(new PayDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getInt(7)));
			}
		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		} // end of try&catch
		return result;
	}

	// 주문취소
	public int payDelete(int payid) {
		int result = 0;
		try {
			// 3. sql문을 만든다.
			String sql = "delete from pay where payid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, payid);
			System.out.println("3. SQL문 생성 완료");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");

		} catch (SQLException e) {
			System.out.println("2~4번에러>> DB관련 에러");
		}
		return result;
	}
}
