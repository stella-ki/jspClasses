package com._05_30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegisterDAO {
	//Data Access Objects model
	public static String tryRegister(RegisterDTO re){
		System.err.println("tryRegister return String");
		String result = "";
		try {
			Connection con = DBConn.getCon();
			Statement stmt = con.createStatement();		
			ResultSet rs = stmt.executeQuery(
					"select * from user_info where user_id = '" + re.getId() + "' and user_pwd = '"+ re.getPw() + "'");
			
			while (rs.next()) {
				result += 
						"아이디 (" + re.getId() + ")의 정보는 "
								+ "[이름 :" + rs.getString(2) + ", "
										+ "나이 : " + rs.getString(5) + ", "
												+ "사용자 번호 : " + rs.getString(1) + "] 입니다.</br>";
			}
			
				
			DBConn.closeCon();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		if(result.equals("")){
			result = "정확한 ID와 Password를 입력해주세요.";
		}
		return result;
	}
	
	public static List<RegisterDTO> tryRegisters(RegisterDTO re){
		System.err.println("tryRegisters return List<RegisterEntity>");
		List<RegisterDTO> list = new ArrayList<>();
		try {
			Connection con = DBConn.getCon();
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(
					"select * from user_info where user_id = '" + re.getId() + "' and user_pwd = '"+ re.getPw() + "'");
			
			while (rs.next()) {
				re.setAdditionalInfo(rs.getString(1), rs.getString(5), rs.getString(2));
				list.add(re);
			}
			
				
			DBConn.closeCon();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return list;
	}


}
