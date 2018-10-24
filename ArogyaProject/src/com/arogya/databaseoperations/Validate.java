package com.arogya.databaseoperations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.arogya.connection.GetCon;
import com.arogya.entity.BeanClass;

public class Validate{
	
	  public static boolean  validation(BeanClass bean){

	GetCon databaseconnection =new GetCon();
	  Connection con=databaseconnection.getCon();
	  if(con==null)
	  {
		  System.out.println("Not connected, please check the connection");

	  }
	  else{
		  String username = bean.getUsername();    
	      String password = bean.getPassword();   
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
      try{
         pstmt= con.prepareStatement("select * from customer where customer_email=? and customer_password=?");
        pstmt.setString(1,username);
        pstmt.setString(2,password);
    	 rs= pstmt.executeQuery();
          
        if(rs.next())
        {
        return true;
         } 
        else{
        	return false;
        }
      }
      catch(SQLException ex){
    	ex.printStackTrace();  
      }
     finally{
    	 try {
			con.close();
			pstmt.close();
	    	
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	 
        }
	  }
	 return false;
	  }
}