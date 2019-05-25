package com.regnant.session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCRUDOperations {
	public static void registerUserInfo(UserBean u) {
		
		try {
			Connection connection=DBConnection.getDBConnection();
			String insertQuery="insert into usersdb.usr_tbl values(?,?)";
			PreparedStatement pstmt;
			pstmt=connection.prepareStatement(insertQuery);
			pstmt.setString(1,u.getUname());
			pstmt.setString(2,u.getUPassword());
			int noOfRows=pstmt.executeUpdate();
			System.out.println("No Of rows inserted into DB"+noOfRows);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static boolean retriveUserInfo(String uname,String upassword) {
		Statement stmt;
		
		Connection connection = DBConnection.getDBConnection();
		try {
			stmt = connection.createStatement();
			ResultSet rs= stmt.executeQuery("Select * from usersdb.usr_tbl where username='"+uname+"' and password='"+upassword+"'");
			if(rs.next()) {
			return true;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
