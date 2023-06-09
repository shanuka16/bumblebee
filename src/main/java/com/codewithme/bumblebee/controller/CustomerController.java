package com.codewithme.bumblebee.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;

import com.codewithme.bumblebee.dao.AdminManager;
import com.codewithme.bumblebee.dao.CustomerManager;
import com.codewithme.bumblebee.model.Admin;
import com.codewithme.bumblebee.model.Customer;
import com.codewithme.bumblebee.service.CustomerService;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerService service;
    public CustomerController() {
    	service = CustomerService.getCustomerService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if(type != null && type.equals("specific")) {
			searchSpecificCustomer(request,response);
		}else {
			searchAllCustomer(request,response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if(type != null && type.equals("add")) 
		{
			addCustomer(request,response);
		}else if(type != null && type.equals("update"))
		{
			updateCustomer(request,response);
		}else if(type != null && type.equals("delete"))
		{
			deleteCustomer(request,response);
		}else if(type != null && type.equals("login"))
		{
			login(request,response);
		}else if(type != null && type.equals("logout"))
		{
			logout(request,response);
		}
	}
	
	//Private Methods
	private void login(HttpServletRequest request, HttpServletResponse response) {
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

					response.sendRedirect("UserHome.jsp");

				} else {
					response.sendRedirect("customerLogin.jsp");
				}

			} else {

				 username = request.getParameter("username");
				 password = request.getParameter("password");

				if (isValidUser(username, password)) {
					session = request.getSession(true);
					session.setAttribute("username", username);
					session.setAttribute("password", password);
					response.sendRedirect("UserHome.jsp");

				} else {
					message = "Login Unsuccessful, Check Username or Password";
					request.setAttribute("message", message);
					RequestDispatcher rd = request.getRequestDispatcher("customerLogin.jsp");
					rd.forward(request, response);
					//response.sendRedirect("customerLogin.jsp");
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.getSession().invalidate();
		response.sendRedirect("customerLogin.jsp");
	}

	private boolean isValidUser(String username, String password) throws ClassNotFoundException, SQLException {
		boolean validity;
		Customer customer = new CustomerManager().login(username, password);
		return validity = customer != null ? true : false;

	}
			private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				
				
				String customerName = request.getParameter("customerName");
				
				
				
				String dateabc = request.getParameter("dob");
	
				
				//long mills = Long.parseLong(request.getParameter("dob"));
				//java.sql.Date dob = new java.sql.Date(Long.parseLong(request.getParameter("dob"))); //Date.parse(request.getParameter("dob"));//  SimpleDateFormat("yyyy-MM-dd").parse("dob") ;//Date.parse(request.getParameter("dob"));  //Date.parse(request.getParameter("dob")) ;
				
				Date date=Date.valueOf(dateabc);
				
				java.util.Date javaDate = new java.util.Date();
		        java.sql.Date dob = new java.sql.Date(javaDate.getTime());
		         
		        //java.sql.Date dob = 2023-05-01; //new java.sql.Date(new java.util.Date(request.getParameter("dob")).getTime()); 
				int customerContact = Integer.parseInt(request.getParameter("customerContact"));
				String custMail = request.getParameter("custMail");
				String custUserName = request.getParameter("custUserName");
				String custPassword = request.getParameter("custPassword");
				boolean loanStatus = false;
								
				Customer customer = new Customer(customerName,date,customerContact,custMail,custUserName,custPassword,loanStatus);
				
				try {
					boolean result = service.registerCustomer(customer);
					if(result) {
						message = "Customer has been added, Customer name "+customerName;
					}else {
						message = "Customer has been failed to add, Customer name "+customerName;
					}
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("addCustomer.jsp");
				rd.forward(request, response);
			}
			
			private void searchAllCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				List<Customer> customerList;
				try {
					customerList = service.getAllCustomer();
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
					customerList = new ArrayList<Customer>();
				}
				request.setAttribute("message", message);
				request.setAttribute("customerList", customerList);
				RequestDispatcher rd = request.getRequestDispatcher("viewAllCustomers.jsp");
				rd.forward(request, response);
				
			}
			private void searchSpecificCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				Customer customer = new Customer();
				int customerId = Integer.parseInt(request.getParameter("customerId")) ;
				
				try {
					customer = service.getSpecificCustomer(customerId);
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				request.setAttribute("message", message);
				request.setAttribute("customer", customer);
				RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdateCustom.jsp");
				rd.forward(request, response);
				
			}
			private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";

				int customerId = Integer.parseInt(request.getParameter("customerId")) ;
				String customerName = request.getParameter("customerName");
				LocalDate dob =  LocalDate.parse("dob");//Date.parse(request.getParameter("dob"));  //Date.parse(request.getParameter("dob")) ;
				int customerContact = Integer.parseInt(request.getParameter("customerContact"));
				String custMail = request.getParameter("custMail");
				String custUserName = request.getParameter("custUserName");
				String custPassword = request.getParameter("custPassword");
				boolean loanStatus = Boolean.parseBoolean(request.getParameter("loanStatus"));
				
				/*
				Customer customer = new Customer(customerId,customerName,dob,customerContact,custMail,custUserName,custPassword,loanStatus);
				
				try {
					boolean result = service.editTheCustomer(customer);
					if(result) {
						message= "Customer Updated Success, Customer Code : "+ customer.getCustomerId() ;
					}else {
						message= "Customer Updation Failed, Customer Code : "+ customer.getCustomerId() ;
					}
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdateProduct.jsp");
				rd.forward(request, response);*/
			}
			private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
				String message = "";
				int customerId = Integer.parseInt(request.getParameter("customerId")) ;
				
				try {
					boolean result = service.deleteTheCustomer(customerId);
					if(result) {
						message= "Customer Deletion Success, Customer Code : "+ customerId ;
					}else {
						message= "Customer Deletion Failed, Customer Code : "+ customerId ;
					}
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				
				//HttpSession session = request.getSession();
				//session.setAttribute("message", session);
				response.sendRedirect("customer");
			}
	
	

}
