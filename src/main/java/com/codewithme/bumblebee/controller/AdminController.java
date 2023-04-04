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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*HttpSession session = request.getSession(false);
		
		String username = null;
		String password = null;
		try {

			if (session != null && session.getAttribute("username") != null
					&& session.getAttribute("password") != null) {

				 username = (String) session.getAttribute("username");
				 password = (String) session.getAttribute("password");

				if (isValidUser(username, password)) {

					response.sendRedirect("AdminHome.jsp");

				} else {
					response.sendRedirect("adminLogin.jsp");
				}

			} else {

				 username = request.getParameter("username");
				 password = request.getParameter("password");

				if (isValidUser(username, password)) {
					session = request.getSession(true);
					session.setAttribute("username", username);
					session.setAttribute("password", password);
					response.sendRedirect("AdminHome.jsp");

				} else {
					response.sendRedirect("adminLogin.jsp");
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String type = request.getParameter("type");

		if (type != null && type.equals("specific")) {
			try {
				searchSpecificAdmin(request, response);
			} catch (ClassNotFoundException | ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (type != null && type.equals("logout")){
			logout(request, response);
		}else {}
	}

	private void searchSpecificAdmin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {

		String message = "";

		HttpSession session = request.getSession(false);
		
		String username = null;
		String password = null;
		try {

			if (session != null && session.getAttribute("username") != null
					&& session.getAttribute("password") != null) {

				 username = (String) session.getAttribute("username");
				 password = (String) session.getAttribute("password");

				if (isValidUser(username, password)) {

					response.sendRedirect("AdminHome.jsp");

				} else {
					response.sendRedirect("adminLogin.jsp");
				}

			} else {

				 username = request.getParameter("username");
				 password = request.getParameter("password");

				if (isValidUser(username, password)) {
					session = request.getSession(true);
					session.setAttribute("username", username);
					session.setAttribute("password", password);
					response.sendRedirect("AdminHome.jsp");

				} else {
					response.sendRedirect("adminLogin.jsp");
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.getSession().invalidate();
		response.sendRedirect("adminLogin.jsp");
	}

	private boolean isValidUser(String username, String password) throws ClassNotFoundException, SQLException {
		boolean validity;
		Admin admin = new AdminManager().getSpecificAdmin(username, password);
		return validity = admin != null ? true : false;

	}

}
