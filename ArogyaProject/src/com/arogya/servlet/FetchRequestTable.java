package com.arogya.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arogya.databaseoperations.FetchRequests;
import com.arogya.entity.Order;

/**
 * Servlet implementation class FetchRequestTable
 */
@WebServlet("/FetchRequestTable")
public class FetchRequestTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List <Order> rlst = FetchRequests.getCustRequests();
		request.setAttribute("customerRequests", rlst);
		RequestDispatcher rd = request.getRequestDispatcher("arogyaCustomerRequests.jsp");
		rd.forward(request, response);
		
	}

}
