package com.codewithme.bumblebee.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithme.bumblebee.model.Customer;


public class CustomerManager {

	public DbConnector getDbConnector() {
		DbConnectoreFactory factory = new mySqlDbConnectorFactoryImpl();
		return factory.getDbConnector();
	} 
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DbConnector connector = getDbConnector();
		return connector.getDbConnection();
	}
	
public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConnection();
		String query ="insert into customer (customerName, dob, customerContact, custMail, custUserName, custPassword, loanStatus) values (?,?,?,?,?,?,?)";
		//java.sql.Statement st = connection.createStatement();
		
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setString(1, customer.getCustomerName());
		ps.setDate(2,  customer.getDob());
		ps.setInt(3, customer.getCustomerContact());
		ps.setString(4, customer.getCustMail());
		ps.setString(5, customer.getCustUserName());
		ps.setString(6, customer.getCustPassword());
		ps.setBoolean(7, customer.isLoanStatus());
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	
	public Customer getSpecificCustomer(int customerId) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "select * from customer where customerId=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, customerId);
		ResultSet rs = ps.executeQuery();
		Customer customer = new Customer();
		while (rs.next()) {
			customer.setCustomerName(rs.getString("customerName"));
			customer.setDob(rs.getDate("dob"));
			customer.setCustomerContact(rs.getInt("customerContact"));
			customer.setCustMail(rs.getString("custMail"));
			customer.setCustUserName(rs.getString("custUserName"));
			customer.setCustPassword(rs.getString("custPassword"));
			customer.setLoanStatus(rs.getBoolean("loanStatus"));
			
		}
		ps.close();
		connection.close();
		return customer;
	}
	public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException{
		
		Connection connection = getConnection();
		
		String query = "select * from customer";
		java.sql.Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		List<Customer> customerList = new ArrayList<Customer>();
		while(rs.next()) {
			Customer customer = new Customer();
			customer.setCustomerName(rs.getString("customerName"));
			customer.setDob(rs.getDate("dob"));
			customer.setCustomerContact(rs.getInt("customerContact"));
			customer.setCustMail(rs.getString("custMail"));
			customer.setCustUserName(rs.getString("custUserName"));
			customer.setCustPassword(rs.getString("custPassword"));
			customer.setLoanStatus(rs.getBoolean("loanStatus"));
			
			customerList.add(customer);
		}
		st.close();
		connection.close();
		
		return customerList;
	}
	public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConnection();
		String query = "update customer set customerName = ?, dob = ?, customerContact = ?, custMail = ?, custUserName = ?, custPassword = ?, loanStatus = ? where customerId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, customer.getCustomerName());
		ps.setDate(2, (Date) customer.getDob());
		ps.setInt(3, customer.getCustomerContact());
		ps.setString(4, customer.getCustMail());
		ps.setString(5, customer.getCustUserName());
		ps.setString(6, customer.getCustPassword());
		ps.setBoolean(7, customer.isLoanStatus());
		
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	public boolean deleteCustomer(int customerId) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "delete from customer where customerId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, customerId);
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	
	
	
	
}
