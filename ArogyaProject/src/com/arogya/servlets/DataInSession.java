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
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		out.println("We are in DoPost of DataInSession");
		 HttpSession session=request.getSession(false);
		 
		  String code=(String) session.getAttribute("code"); 
		  out.println("Random code is Data In Session "+code);
		  int quant= (Integer)session.getAttribute("quantity");
		  out.println("Random code is Data In Session "+quant);
		  int subCatId=(Integer)session.getAttribute("SubCatId");
		  out.println("Random code is Data In Session "+subCatId);
		out.println("code in SaveOrderDetails " +code+" quantity "+quant+" subcatId "+subCatId);
		 String n=(String) session.getAttribute("username");  
		 FetchArogyaDetails quantityOrder=new FetchArogyaDetails();
		 int valueQuantity=(int) quantityOrder.FetchArogyaDetailsCon(subCatId,quant);
		 System.out.println("data from fetchArogya after checking "+valueQuantity);
		 if(valueQuantity>0){
			 
			 int insertStatus=(int) quantityOrder.InsertOrderCode(code,quant,subCatId);	
			 System.out.println("Record inserted in table successfully"+insertStatus);
			 int updateQuant=(int) quantityOrder.UpdateQuantityInTable(subCatId,quant);
			 System.out.println("Rows Affected after updating data "+updateQuant);
			 doGet(request, response);
		 }else{
			 System.out.println("sorry for the inconvinience,we are low with products");
		 }
	}

}
