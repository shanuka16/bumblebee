package com.codewithme.bumblebee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codewithme.bumblebee.model.Customer;
import com.codewithme.bumblebee.model.Loan;

public class LoanManager {
	public DbConnector getDbConnector() {
		DbConnectoreFactory factory = new mySqlDbConnectorFactoryImpl();
		return factory.getDbConnector();
	} 
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DbConnector connector = getDbConnector();
		return connector.getDbConnection();
	}
	
	public Loan getSpecificLoan(int customerId) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "select * from loan where customerIdLoan=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, customerId);
		ResultSet rs = ps.executeQuery();
		Loan loan = new Loan();
		while (rs.next()) {
			loan.setIdLoan(rs.getInt("IdLoan"));
			loan.setCustomerIdLoan(rs.getInt("customerIdLoan"));
			loan.setUsedAmount(rs.getDouble("usedAmount"));
			loan.setLoanBalance(rs.getDouble("loanBalance"));
			loan.setInstallmentOne(rs.getDouble("installmentOne"));
			loan.setInstallmentTwo(rs.getDouble("installmentTwo"));
			loan.setInstallmentThree(rs.getDouble("installmentThree"));
			loan.setStartDate(rs.getDate("startDate"));
			loan.setEndDate(rs.getDate("endDate"));
						
		}
		ps.close();
		connection.close();
		return loan;
	}
}
