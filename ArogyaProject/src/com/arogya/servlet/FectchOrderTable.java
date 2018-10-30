package com.arogya.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arogya.databaseoperations.FetchOrder;
import com.arogya.entity.Order;


@WebServlet("/FectchOrderTable")
public class FectchOrderTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<Order> odlist  = FetchOrder.getOrderDetails();
		request.setAttribute("orderlist", odlist);
		RequestDispatcher rd = request.getRequestDispatcher("arogyaOrder.jsp");
		rd.forward(request, response);
		
	}

}
