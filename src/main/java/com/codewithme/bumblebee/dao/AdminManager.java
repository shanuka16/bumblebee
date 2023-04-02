package com.codewithme.bumblebee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codewithme.bumblebee.model.Admin;
import com.codewithme.bumblebee.model.Product;

public class AdminManager {
	public DbConnector getDbConnector() {
		DbConnectoreFactory factory = new mySqlDbConnectorFactoryImpl();
		return factory.getDbConnector();
	} 
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DbConnector connector = getDbConnector();
		return connector.getDbConnection();
	}
	
	public Admin getSpecificAdmin(int adminId) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "select count(*) from admin where userName=? and password=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, "userName");
		ps.setString(2, "password");
		ResultSet rs = ps.executeQuery();
		Admin admin = new Admin();
		while (rs.next()) {
			admin.setAdminId(rs.getInt("adminId"));
			admin.setName(rs.getString("name"));
		}
		
		ps.close();
		connection.close();
		return rs;		
		
	}
	
	

}
