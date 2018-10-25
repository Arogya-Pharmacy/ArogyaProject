package com.arogya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arogya.databaseoperations.*;
import com.arogya.entity.Entity;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		int type=Integer.parseInt(request.getParameter("type"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int phonenumber=Integer.parseInt(request.getParameter("phonenumber"));
		
		Entity entity =new Entity();
		entity.setType(type);
		entity.setName(name);
		entity.setEmail(email);
		entity.setPassword(password);
		entity.setPhonenumber(phonenumber);
		
		ResisterServlet reg=new ResisterServlet();
		 boolean b = false;
			try {
				b = reg.check(entity);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				//doGet(request, response);
		      if(b){
		    	 RequestDispatcher rd=request.getRequestDispatcher("Userexist.jsp") ;
		    	 rd.forward(request, response);
		      }
		      else{
		    	  boolean a = false;
				try {
					a = reg.register(entity);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	  if(a){
		    		  
		    		if(type == 1){
		    		  RequestDispatcher rd=request.getRequestDispatcher("Userregisterd.jsp") ;
		    	    	 rd.forward(request, response);
		    		  
		    		}
		    		else{
		    			RequestDispatcher rd=request.getRequestDispatcher("arogyaEmpLogin.jsp") ;
		    	    	 rd.forward(request, response);
		    		}
		    	  }
		    	  
		    	  else{
		    		  RequestDispatcher rd=request.getRequestDispatcher("Notregistered.jsp") ;
		 	    	 rd.forward(request, response);
		    	  }
		    	  
		    	  
		    	  
		      }
     
		doGet(request, response);
	}

}
