package com.arogya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arogya.databaseoperations.FetchArogyaDetails;

/**
 * Servlet implementation class ProductPrice
 */
@WebServlet("/ProductPrice")
public class ProductPrice extends HttpServlet {

	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductPrice() {
        super();
        System.out.println("We are in Servlet Page");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ENTERING DO GET");
		PrintWriter out=response.getWriter();
		String subCatProdName=request.getParameter("productSubCat");
		int prodQuantity=Integer.parseInt(request.getParameter("quantity"));
		System.out.println("Subcategory Product Name "+subCatProdName+" Product Quantity "+prodQuantity);
		FetchArogyaDetails quantityOrder=new FetchArogyaDetails();
		Double price=quantityOrder.FetchPriceAndQuantity(subCatProdName,prodQuantity);	
		if(price==0.0){
			System.out.println("Do nothing");
			RequestDispatcher rd=request.getRequestDispatcher("order/NoProduct.jsp");
			rd.forward(request, response);
		} else{
			double totalPrice=price*prodQuantity;
			System.out.println("cost of "+prodQuantity+" "+subCatProdName+" is ::: "+price*prodQuantity);
			request.setAttribute("totalPrice",totalPrice);
			RequestDispatcher rd=request.getRequestDispatcher("order/OrderPlaced.jsp");
			rd.forward(request, response);
		}
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
