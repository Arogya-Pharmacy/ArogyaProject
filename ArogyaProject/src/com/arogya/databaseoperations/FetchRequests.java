package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arogya.connection.GetCon;
import com.arogya.entity.Order;

public class FetchRequests {

	 public static List<Order>  getCustRequests(){
		  List<Order> lst = new ArrayList<Order>();
		  GetCon databaseconnection =new GetCon();
	  Connection con=databaseconnection.getCon();
	  if(con==null)
	  {
		  System.out.println("Not connected, please check the connection");
		  return null;
	  }
	  else{
		
		  System.out.println("connection is established");
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    try{
String query ="select customer_request_quantity,product_subcat_id,product_subcat_name from customerrequest,productsubcategory";
pstmt= con.prepareStatement(query);

  	 rs= pstmt.executeQuery();
       
  	 while(rs.next()){
  		
  		Order ord = new Order();
//  		ord.setCustRequestid(rs.getString(1));
//  		ord.setCustorder_id(rs.getString(2));
//  		ord.setCustomer_id(rs.getString(3));
  		ord.setEmp_request_qnty(rs.getString(1));
  		ord.setProduct_subcat_id(rs.getString(2));
  		ord.setProduct_subcat_name(rs.getString(3));
  		 lst.add(ord);
  		 
  	 }
  	 rs.close();
  	 pstmt.close();
	   con.close();
  	 return lst;
  	
    }
    catch(SQLException ex){
  	  ex.printStackTrace(); 
  	  return null;
    }
   
   /*finally{
  	 try {
		if(rs!=null||pstmt!=null||con!=null){	 
  		 rs.close();
			   pstmt.close();
			   con.close();
		}
	    	
		}catch (SQLException e) {
			e.printStackTrace();
		
		}
  	 
  }*/
    
}

}

	
}
