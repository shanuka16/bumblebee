package com.codewithme.bumblebee.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String type = request.getParameter("type");
		if(type != null && type.equals("specific")) {
			searchSpecificAdmin(request,response);
		}else {
			//searchAllAdmin(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private void searchSpecificAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "";
		Admin admin = new Admin();
		int adminId = Integer.parseInt(request.getParameter("adminId")) ;
		
		try {
			admin = service.getSpecificAdmin(adminId);
		} catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		request.setAttribute("message", message);
		request.setAttribute("product", product);
		RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdateProduct.jsp");
		rd.forward(request, response);
		
	}

}
