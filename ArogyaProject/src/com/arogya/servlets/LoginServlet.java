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


import com.arogya.databaseoperations.Login;
import com.arogya.entity.LoginEntity;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			PrintWriter out=response.getWriter();
			
			try{
			 String username=request.getParameter("uname");
			 String password=request.getParameter("psw");
				HttpSession httpsession=request.getSession();
				httpsession.setAttribute("username", username);
			LoginEntity bean = new LoginEntity();
				
		  		bean.setUsername(username);
				bean.setPassword(password);
			Login login = new Login();
				
			int type  =	login.getType(username);
		
		       boolean b= login.validation(bean);
		      

			
				if(b){
					
					if(type == 1){
						
					
					 RequestDispatcher rd=request.getRequestDispatcher("category.jsp");  
				     rd.forward(request,response);  
					}
					else{
						RequestDispatcher rd=request.getRequestDispatcher("arogyaEmpHome.jsp");  
					     rd.forward(request,response);  
					}
				}
				else{
					 RequestDispatcher rds=request.getRequestDispatcher("login.jsp");  
				     rds.forward(request,response); 
				}
		
			}
			catch(Exception e){
			e.printStackTrace();
				
			}
		  
		doGet(request, response);
	}
	}



