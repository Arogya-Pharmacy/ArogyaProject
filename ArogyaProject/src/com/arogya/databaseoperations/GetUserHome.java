package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arogya.connection.GetCon;
import com.arogya.entity.Product;

public class GetUserHome {
	
	

	public List<Product> userhome() throws SQLException {
		// TODO Auto-generated method stub
		GetCon databaseconnection =new GetCon();
		  Connection con=databaseconnection.getCon();
		  List<Product> al=new ArrayList<Product>();
		  Product product=new Product();
		  if(con==null)
		  {
			  System.out.println("Not connected, please check the connection");

		  }
		  else{
			  PreparedStatement psmt = con.prepareStatement("select * from productcategory");
			 ResultSet rs= psmt.executeQuery();
			 while(rs.next()){
				 product.setProductid(rs.getInt(1));
				 product.setProductname(rs.getString(2));
				 al.add(product);
				 //System.out.println(rs.getInt(1)+";"+rs.getString(2));
			
				 }
			
			 return al;
		  }
		return null;
		
	}

}
