package com.codewithme.bumblebee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithme.bumblebee.model.Product;
public class ProductManager {

	
	public DbConnector getDbConnector() {
		DbConnectoreFactory factory = new mySqlDbConnectorFactoryImpl();
		return factory.getDbConnector();
	} 
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DbConnector connector = getDbConnector();
		return connector.getDbConnection();
	}
	
	
	public boolean addProduct(Product product) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConnection();
		String query ="insert into product (name, price, description, category) values (?,?,?,?)";
		//java.sql.Statement st = connection.createStatement();
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, product.getName());
		ps.setDouble(2, product.getPrice());
		ps.setString(3, product.getDescription());
		ps.setString(4, product.getCategory());
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	
	public Product getSpecificProduct(int productCode) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "select * from product where productCode=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, productCode);
		ResultSet rs = ps.executeQuery();
		Product product = new Product();
		while (rs.next()) {
			product.setProductCode(rs.getInt("productCode"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getDouble("price"));
			product.setDescription(rs.getString("description"));
			product.setCategory(rs.getString("category"));
		}
		ps.close();
		connection.close();
		return product;
	}
	public List<Product> getAllProducts() throws ClassNotFoundException, SQLException{
		
		Connection connection = getConnection();
		
		String query = "select * from product";
		java.sql.Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		List<Product> productList = new ArrayList<Product>();
		while(rs.next()) {
			Product product = new Product();
			product.setProductCode(rs.getInt("productCode"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getDouble("price"));
			product.setDescription(rs.getString("description"));
			product.setCategory(rs.getString("category"));
			
			productList.add(product);
		}
		st.close();
		connection.close();
		
		return productList;
	}
	public boolean updateProduct(Product product) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConnection();
		String query = "update product set name = ?, price = ?, description = ?, category = ? where productCode = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, product.getName());
		ps.setDouble(2, product.getPrice());
		ps.setString(3, product.getDescription());
		ps.setString(4, product.getCategory());
		ps.setInt(5, product.getProductCode());
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	public boolean deleteProduct(int productCode) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "delete from product where productCode = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, productCode);
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	
	
}
