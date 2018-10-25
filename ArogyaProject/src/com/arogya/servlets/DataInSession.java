package com.arogya.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DataInSession
 */
@WebServlet("/DataInSession")
public class DataInSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataInSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("SESSION SERVLET CALLED");
		System.out.println("SESSION SERVLET CALLED");
		int id=Integer.parseInt(request.getParameter("id"));
		int qun=Integer.parseInt(request.getParameter("quantity"));
		String productName=request.getParameter("ProductName");  
		int price=Integer.parseInt(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		price*=quantity;
		request.setAttribute("productName", productName);
		request.setAttribute("price", price);
		request.setAttribute("quantity", quantity);
	    System.out.println("ProductName "+productName+" Price "+price+"Quantity "+quantity);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/DisplayOrder.jsp");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
