package com.codewithme.bumblebee.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codewithme.bumblebee.dao.AdminManager;
import com.codewithme.bumblebee.model.Admin;
import com.codewithme.bumblebee.model.Product;
import com.codewithme.bumblebee.service.AdminServices;
import com.codewithme.bumblebee.service.ProductService;


public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AdminServices service;
    public AdminController() {
    	service = AdminServices.getAdminServices();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if(type != null && type.equals("specific")) {
			searchSpecificAdmin(request,response);
		}else {
			//searchAllAdmin(request,response);
		}
	}
	
	private void searchSpecificAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "";
		
		String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        
        
        
        //Admin user = userDao.checkLogin(email, password);
		//String destPage = "login.jsp";
		Admin admin;
		AdminManager adminMangr = new AdminManager();
		try {
			admin = adminMangr.getSpecificAdmin(username,password);
			String destPage = "index.jsp";
			
			if (admin != null) {
			    HttpSession session = request.getSession();
			    session.setAttribute("admin", admin);
			    destPage = "AdminHome.jsp";
			} else {
			    message = "Invalid email/password";
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
        
		/*
		//Admin admin = new Admin();
		//int adminId = Integer.parseInt(request.getParameter("adminId")) ;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Admin admin = new Admin(username,password);
		
		boolean result;
		try {
			result = service.getSpecificAdmin(admin);
			if(result == true) {
				message = "Product has been added, Product name "+username;
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
				rd.forward(request, response);
			}else {
				//message = "Product has been failed to add, Product name "+username;
			}
		} catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}*/
				
	}

}
