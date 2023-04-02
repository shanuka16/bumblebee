package com.codewithme.bumblebee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithme.bumblebee.model.Category;

public class CategoryManager {
	public DbConnector getDbConnector() {
		DbConnectoreFactory factory = new mySqlDbConnectorFactoryImpl();
		return factory.getDbConnector();
	} 
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		DbConnector connector = getDbConnector();
		return connector.getDbConnection();
	}
	
	public boolean addCategory(Category category) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConnection();
		String query ="insert into category (categoryName) values (?)";
		//java.sql.Statement st = connection.createStatement();
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, category.getCategoryName());
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	
	public Category getSpecificCategory(int categoryId) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		
		String query = "select * from category where categoryId=?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, categoryId);
		ResultSet rs = ps.executeQuery();
		Category category = new Category();
		while (rs.next()) {
			category.setCategoryId(rs.getInt("categoryId"));
			category.setCategoryName(rs.getString("categoryName"));			
		}
		ps.close();
		connection.close();
		return category;
	}
	public List<Category> getAllCategories() throws ClassNotFoundException, SQLException{
		
		Connection connection = getConnection();
		
		String query = "select * from category";
		java.sql.Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		List<Category> categoryList = new ArrayList<Category>();
		while(rs.next()) {
			Category category = new Category();
			category.setCategoryId(rs.getInt("categoryId"));
			category.setCategoryName(rs.getString("categoryName"));
			
			categoryList.add(category);
		}
		st.close();
		connection.close();
		
		return categoryList;
	}
	public boolean updateCategory(Category category) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConnection();
		String query = "update category set categoryName = ? where categoryId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, category.getCategoryName());
		ps.setInt(2, category.getCategoryId());		
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	public boolean deleteProduct(int categoryId) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String query = "delete from category where categoryId = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, categoryId);
		int result = ps.executeUpdate();
		ps.close();
		connection.close();
		return result>0;
	}
	
	
	
}
