package com.arogya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arogya.daoimpl.ArogyaDaoImpl;
import com.arogya.entity.Entity;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1;
   
    public Register() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Insert method");
	
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int phonenumber=Integer.parseInt(request.getParameter("phonenumber"));
		System.out.println(name+""+email+" "+password+" "
				+phonenumber);
		Entity entity =new Entity();
		entity.setName(name);
		entity.setEmail(email);
		entity.setPassword(password);
		entity.setPhonenumber(phonenumber);
		
		ArogyaDaoImpl arogyadaoimpl=new ArogyaDaoImpl();
      boolean b=  arogyadaoimpl.check(entity);
		//doGet(request, response);
      if(b){
    	 RequestDispatcher rd=request.getRequestDispatcher("Userexist.jsp") ;
    	 rd.forward(request, response);
      }
      else{
    	  boolean a=arogyadaoimpl.register(entity);
    	  if(a){
    		  RequestDispatcher rd=request.getRequestDispatcher("Userregisterd.jsp") ;
    	    	 rd.forward(request, response);
    	  }
    	  
    	  else{
    		  RequestDispatcher rd=request.getRequestDispatcher("Notregistered.jsp") ;
 	    	 rd.forward(request, response);
    	  }
    	  
    	  
    	  
      }
	}

} 
