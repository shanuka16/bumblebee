package com.codewithme.bumblebee.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithme.bumblebee.dao.CategoryManager;
import com.codewithme.bumblebee.model.Category;

public class CategoryServices {

	private static CategoryServices categoryServiceObject;
	private CategoryServices() {}
	
	public static synchronized CategoryServices getCategoryServices() {
		if(categoryServiceObject == null) {
			categoryServiceObject = new CategoryServices();
		}		
		return categoryServiceObject;
	}
	private CategoryManager getCategoryManager(){
		return new CategoryManager();
	}
	public boolean registerCategory(Category category) throws ClassNotFoundException, SQLException {
		
		return getCategoryManager().addCategory(category);
	}
	
	public Category getSpecificCategory(int categoryId) throws ClassNotFoundException, SQLException {
		return getCategoryManager().getSpecificCategory(categoryId);
	}
	
	public List<Category> getAllCategory() throws ClassNotFoundException, SQLException{
		return getCategoryManager().getAllCategories();
	}
	public boolean editTheCategory(Category category) throws ClassNotFoundException, SQLException {
		return getCategoryManager().updateCategory(category);
	}
	public boolean deleteTheCategory(int categoryId) throws ClassNotFoundException, SQLException {
		return getCategoryManager().deleteProduct(categoryId);
	}
}
