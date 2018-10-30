package com.arogya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Getdetails
 */
@WebServlet("/Getdetails")
public class Getdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getdetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("html/text");
int prodquantity=Integer.parseInt(request.getParameter("quantity"));
int prodid=Integer.parseInt(request.getParameter("prodSubcatId"));
String prodname=request.getParameter("ProductName");
int prodcost=Integer.parseInt(request.getParameter("price"));
request.setAttribute("SubCatId",prodid);
request.setAttribute("productName", prodname);
request.setAttribute("quantity", prodquantity);

request.setAttribute("pri", prodcost);
System.out.println("quantity"+prodquantity);
RequestDispatcher rd=request.getRequestDispatcher("/jsp/DisplayOrder.jsp");
rd.forward(request, response);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
