package com.arogya.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.arogya.databaseoperations.FetchEmployee;
import com.arogya.entity.Employee;



@WebServlet("/EmpLogin")
public class EmpLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public EmpLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String username = request.getParameter("uname");
			String password = request.getParameter("pwd");
		
		
		List<Employee> lst  = FetchEmployee.getLogin();
		
		for(Employee e : lst){
			if((e.getEmail().equals(username))&& (e.getPassword().equals(password))){
				
		/*	RequestDispatcher rd = request.getRequestDispatcher("arogyaEmpHome.jsp");
			rd.forward(request, response);*/
				HttpSession session  = request.getSession();
				session.setAttribute("username", username);
				response.sendRedirect("arogyaEmpHome.jsp");
				return;
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("arogyaEmpLogin.jsp");
				rd.forward(request, response);
				
			}
		}
		
	
		
		
		
		
		
		
	}

}
