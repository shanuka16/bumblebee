package com.codewithme.bumblebee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mySqlConnectorImpl implements DbConnector {

	@Override
	public Connection getDbConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/bumble_bee";
		String userName = "root";
		String password = "password";
		Connection connection = DriverManager.getConnection(url, userName, password);
		
		return connection;
	}

}
