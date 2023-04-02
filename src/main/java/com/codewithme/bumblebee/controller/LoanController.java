package com.codewithme.bumblebee.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codewithme.bumblebee.model.Customer;
import com.codewithme.bumblebee.model.Loan;
import com.codewithme.bumblebee.service.CustomerService;
import com.codewithme.bumblebee.service.LoanService;

public class LoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private LoanService service;
    public LoanController() {
    	service = LoanService.getLoanService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if(type != null && type.equals("specific")) {
			searchSpecificLoan(request,response);
		}else {
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
	
	private void searchSpecificLoan(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "";
		Loan loan = new Loan();
		int customerIdLoan = Integer.parseInt(request.getParameter("customerIdLoan")) ;
		
		try {
			loan = service.getSpecificLoan(customerIdLoan);
		} catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		request.setAttribute("message", message);
		request.setAttribute("loan", loan);
		RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdateLoan.jsp");
		rd.forward(request, response);
		
	}

}
