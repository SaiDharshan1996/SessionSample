package com.regnant.session;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BusDBCRUDOperations {

	public static List<BusBean> retriveStudentsInfo(String bsource,String bdestination) {
		List<BusBean> buslist = new ArrayList<>();
		Statement stmt;
		ResultSet rs;
		Connection connection = BusDBConnection.getDBConnection();
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from traveldb.bus_tbl where source='"+bsource+"' and destination='"+bdestination+"'");
			while (rs.next()) {
				BusBean b = new BusBean();
				b.setId(rs.getInt(1));
				b.setBSource(rs.getString(2));
				b.setBDestination(rs.getString(3));
				b.setBDOJ(rs.getString(4));
				b.setBTime(rs.getString(5));
				b.setBName(rs.getString(6));
				b.setBType(rs.getString(7));
				b.setBCondition(rs.getString(8));
				b.setBno(rs.getString(9));
				buslist.add(b);
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return buslist;
	}
	
	public static List<BusBean> retiriveContextInfo(String condition){
		List<BusBean> buscon=new ArrayList<BusBean>();
		Statement stmt;
		ResultSet rs;
		Connection connection=BusDBConnection.getDBConnection();
		try {
			stmt=connection.createStatement();
			rs=stmt.executeQuery("Select * from traveldb.bus_tbl where bus_condition='"+condition+"'");
			while(rs.next()) {
				BusBean b=new BusBean();
				b.setId(rs.getInt(1));
				b.setBSource(rs.getString(2));
				b.setBDestination(rs.getString(3));
				b.setBDOJ(rs.getString(4));
				b.setBTime(rs.getString(5));
				b.setBName(rs.getString(6));
				b.setBType(rs.getString(7));
				b.setBCondition(rs.getString(8));
				b.setBno(rs.getString(9));
				buscon.add(b);
			}
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return buscon;
		
	}

}
