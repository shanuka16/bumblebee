package com.codewithme.bumblebee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;

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
	
	public Admin getSpecificAdmin(String userName, String password) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();		
		
        String sql = "SELECT * FROM admin WHERE userName=? and password=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, userName);
        statement.setString(2, password);
 
        ResultSet result = statement.executeQuery(); 
        Admin admin = null; 
        if (result.next()) {
        	admin = new Admin();
        	admin.setUserName(result.getString("userName"));
        } 
        connection.close(); 
        return admin;		
		
		/*
		String query = "select * from admin where userName=? and password=? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, "un");
		ps.setString(2, "pw");
		ResultSet rs = ps.executeQuery();
		
		if(rs == null) {
			ps.close();
			connection.close();
			return false;
		}
		else {
			ps.close();
			connection.close();
			return true;
		}
		*/
		
	}
}
