package com.arogya.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arogya.databaseoperations.FetchCategory;
import com.arogya.entity.CategoryBean;

/**
 * Servlet implementation class CategoryServlet
 */
@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
  		
  		 ArrayList<CategoryBean> lst= FetchCategory.productDetails();
  		
  	  request.setAttribute("productdetails",lst);
  	  
  	  RequestDispatcher rd=request.getRequestDispatcher("fetchProduct.jsp");
  	  rd.forward(request, response);
  	
  	
  	}

}
