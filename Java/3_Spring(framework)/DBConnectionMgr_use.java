package com.mega.mvc09;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBCPTest1 {

	public static void main(String[] args) {
		
		DBConnectionMgr dbcp = DBConnectionMgr.getInstance();
		try {
			//1,2단계 해줌. (드라이버 설정, db연결)
			Connection con = dbcp.getConnection();
			//dbcp에서 연결해놓은 것 중 하나의 연결을 가져와서 3,4를 수행
			String sql = "insert into member values ('test','test','test','test')";
			con.prepareStatement(sql);
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.executeUpdate();
			
			//하나 꺼내썼던 con(주소)을 반납!
			dbcp.freeConnection(con,ps);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
