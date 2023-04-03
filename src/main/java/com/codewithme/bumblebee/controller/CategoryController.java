package com.codewithme.bumblebee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codewithme.bumblebee.model.Category;
import com.codewithme.bumblebee.service.CategoryServices;


public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CategoryServices service;
    public CategoryController() {
    	service = CategoryServices.getCategoryServices();
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if(type != null && type.equals("specific")) {
			searchSpecificCategory(request,response);
		}else if(type != null && type.equals("select")){
			getAllCategories(request,response);
		}else {
			searchAllCategories(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		if(type != null && type.equals("add")) 
		{
			addCategory(request,response);
		}else if(type != null && type.equals("update"))
		{
			updateCategory(request,response);
		}else if(type != null && type.equals("delete"))
		{
			deleteCategory(request,response);
		}
	}

	//Private Methods
			private void addCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				
				String categoryName = request.getParameter("categoryName");
				
				Category category = new Category(categoryName);
				
				try {
					boolean result = service.registerCategory(category);
					if(result) {
						message = "Category has been added, Category name "+categoryName;
					}else {
						message = "Category has been failed to add, Category name "+categoryName;
					}
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("addCategory.jsp");
				rd.forward(request, response);
			}
			
			private void searchAllCategories(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				List<Category> categoryList;
				try {
					categoryList = service.getAllCategory();
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
					categoryList = new ArrayList<Category>();
				}
				request.setAttribute("message", message);
				request.setAttribute("categoryList", categoryList);
				RequestDispatcher rd = request.getRequestDispatcher("viewAllCategories.jsp");
				rd.forward(request, response);
				
			}
			
			private void getAllCategories(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				List<Category> categoryList;
				try {
					categoryList = service.getAllCategory();
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
					categoryList = new ArrayList<Category>();
				}
				request.setAttribute("message", message);
				request.setAttribute("categoryList", categoryList);
				RequestDispatcher rd = request.getRequestDispatcher("addProduct.jsp");
				rd.forward(request, response);
				
			}
			
			private void searchSpecificCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				Category category = new Category();
				int categoryId = Integer.parseInt(request.getParameter("categoryId")) ;
				
				try {
					category = service.getSpecificCategory(categoryId);
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				request.setAttribute("message", message);
				request.setAttribute("category", category);
				RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdateCategories.jsp");
				rd.forward(request, response);
				
			}
			private void updateCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String message = "";
				int categoryId = Integer.parseInt(request.getParameter("categoryId")) ;
				String categoryName = request.getParameter("categoryName") ; 
				Category category = new Category(categoryId, categoryName);
				
				try {
					boolean result = service.editTheCategory(category);
					if(result) {
						message= "Category Updated Success, Category Code : "+ category.getCategoryId() ;
					}else {
						message= "Category Updation Failed, Category Code : "+ category.getCategoryId() ;
					}
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				request.setAttribute("message", message);
				RequestDispatcher rd = request.getRequestDispatcher("SearchAndUpdateCategories.jsp");
				rd.forward(request, response);
			}
			private void deleteCategory(HttpServletRequest request, HttpServletResponse response) throws IOException {
				String message = "";
				int categoryId = Integer.parseInt(request.getParameter("categoryId")) ;
				
				try {
					boolean result = service.deleteTheCategory(categoryId);
					if(result) {
						message= "Category Deletion Success, Category Code : "+ categoryId ;
					}else {
						message= "Category Deletion Failed, Category Code : "+ categoryId ;
					}
				} catch (ClassNotFoundException | SQLException e) {
					message = e.getMessage();
				}
				
				//HttpSession session = request.getSession();
				//session.setAttribute("message", session);
				response.sendRedirect("CategoryController");
			}
}
