package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.arogya.connection.GetCon;
import com.arogya.entity.LoginEntity;

public class Login {
	 public static boolean  validation(LoginEntity bean) throws SQLException{

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
		         pstmt= con.prepareStatement("select * from registration where email=? and password=?");
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

	public int getType(String username) throws SQLException {
		GetCon databaseconnection =new GetCon();
		  Connection con=databaseconnection.getCon();
		  if(con==null)
		  {
			  System.out.println("Not connected, please check the connection");

		  }
		  else{
			  String Username =username;    
		      
		      PreparedStatement pstmt=null;
		      ResultSet rs=null;
	      try{
	         pstmt= con.prepareStatement("select role_id from registration where email=? ");
	        pstmt.setString(1,Username);
	        rs= pstmt.executeQuery();
	        while(rs.next()){
	        	return rs.getInt(1);
	        }

	
	}
	      catch(Exception e){
	    	  
}
		  }
			return 0;
			
}
	}
