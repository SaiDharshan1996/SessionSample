package com.regnant.session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BusDBConnection {
	public static Connection getDBConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/traveldb", "root", "gudavalli");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
