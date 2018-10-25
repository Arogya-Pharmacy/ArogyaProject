package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.arogya.connection.GetCon;
import com.arogya.entity.CategoryBean;

public class FetchCategory {

	public static  ArrayList<CategoryBean> productDetails()
	{
		
		ArrayList<CategoryBean> al=new ArrayList<CategoryBean>();
		
		GetCon databaseconnection =new GetCon();
		  Connection con=databaseconnection.getCon();
		  if(con==null)
		  {
			  System.out.println("Not connected, please check the connection");

		  }
		  else{
		     Statement stmt=null;
		      ResultSet rs=null;
	      
	           try {
				stmt = con.createStatement() ;
				
				rs =stmt.executeQuery("select product_cat_id,product_cat_name from productcategory") ;
				  
			     while(rs.next())	{	
				 CategoryBean bean=new CategoryBean();
				 		bean.setProductId(rs.getInt(1));
				 		bean.setProductName(rs.getString(2));
				     al.add(bean);
				    
			     }
			     rs.close();
			     stmt.close();
			     con.close();
			     return al;
	           }
			     catch (SQLException e) {
				e.printStackTrace();
			}
	              
	}
		
	
		  return al; 
	
}
}