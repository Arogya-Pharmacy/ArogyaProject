package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arogya.connection.GetCon;
import com.arogya.entity.Order;


public class StockProcess {
	
	
	public void updateStock(List list){
		
		
		GetCon databaseconnection =new GetCon();
		  Connection con=databaseconnection.getCon();
		  if(con==null)
		  {
			  System.out.println("Not connected, please check the connection");
			  
		  }
		  else{
			
			  
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try{
	         pstmt= con.prepareStatement("select * from Supplyoffice");

	    	 rs= pstmt.executeQuery();
	         
	    	 
	      }
	      catch(SQLException ex){
	    	  ex.printStackTrace(); 
	    	
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
