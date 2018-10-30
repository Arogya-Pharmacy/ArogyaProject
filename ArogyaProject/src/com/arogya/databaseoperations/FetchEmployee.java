package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arogya.connection.GetCon;
import com.arogya.entity.Employee;


	public class FetchEmployee {
		
		  public static List<Employee>  getLogin(){
			  List<Employee> lst = new ArrayList<Employee>();
			  GetCon databaseconnection =new GetCon();
		  Connection con=databaseconnection.getCon();
		  if(con==null)
		  {
			  System.out.println("Not connected, please check the connection");
			  return null;
		  }
		  else{
			
			  
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try{
	         pstmt= con.prepareStatement("select * from pharmacyemp");

	    	 rs= pstmt.executeQuery();
	         
	    	 while(rs.next()){
	    		
	    		 Employee emp = new Employee();
	    		 emp.setEmail(rs.getString(1));
	    		 emp.setPassword(rs.getString(2));
	    		 lst.add(emp);
	    		 
	    	 }
	    	 return lst;
	      }
	      catch(SQLException ex){
	    	  ex.printStackTrace(); 
	    	  return null;
	      }
	     
	     finally{
	    	 try {
				   rs.close();
				   pstmt.close();
				   con.close();
		
		    	
			}catch (SQLException e) {
				e.printStackTrace();
			
			}
	    	 
	    }
	      
  }
	
  }
	
}
