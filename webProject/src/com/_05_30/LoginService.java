package com._05_30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

	public boolean login(String idStr, String pwStr) {
		try {
			Connection con = DBConn.getCon();			
			String sql = "select * from user_info where user_id = ? and user_pwd = ?";
			PreparedStatement prestmt = con.prepareStatement(sql);
			
			prestmt.setString(1, idStr);
			prestmt.setString(2, pwStr);
			
			ResultSet rs = prestmt.executeQuery();
			
			while(rs.next()){
				return true;
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				DBConn.closeCon();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}
}