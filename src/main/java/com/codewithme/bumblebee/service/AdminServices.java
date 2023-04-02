package com.codewithme.bumblebee.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithme.bumblebee.dao.AdminManager;
import com.codewithme.bumblebee.dao.ProductManager;
import com.codewithme.bumblebee.model.Admin;

public class AdminServices {
	
	private static AdminServices adminServiceObject;
	private AdminServices() {}
	
	public static synchronized AdminServices getAdminServices() {
		if(adminServiceObject == null) {
			adminServiceObject = new AdminServices();
		}		
		return adminServiceObject;
	}
	private AdminManager getAdminManager(){
		return new AdminManager();
	}	


	public boolean registerAdmin(Admin admin) throws ClassNotFoundException, SQLException {
		return false;
	}	
	public boolean getSpecificAdmin(int adminId) throws ClassNotFoundException, SQLException {
		return getAdminManager().getSpecificAdmin(adminId);
	}	
	public List<Admin> getAllAdmin() throws ClassNotFoundException, SQLException{
		return new ArrayList<Admin>();
	}
	public boolean editTheAdmin(Admin admin) throws ClassNotFoundException, SQLException {
		return false;
	}
	public boolean deleteTheAdmin(int adminId) throws ClassNotFoundException, SQLException {
		return false;
	}
}
