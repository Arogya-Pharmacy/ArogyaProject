package com.arogya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arogya.databaseoperations.Validate;
import com.arogya.entity.BeanClass;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		 response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		 String username=request.getParameter("uname");
		 String password=request.getParameter("psw");
			
		  BeanClass bean = new BeanClass();
			
	  		bean.setUsername(username);
			bean.setPassword(password);
	       boolean b= Validate.validation(bean);
		
			if(b){
				 RequestDispatcher rd=request.getRequestDispatcher("homePage.jsp");  
			     rd.forward(request,response);  
			}
			else{
			out.println("please Register for login.."); //registration link
			}
	
	  out.flush();
	  out.close();
	  }
	  
	}

