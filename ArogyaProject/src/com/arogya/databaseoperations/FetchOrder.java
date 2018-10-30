package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arogya.connection.GetCon;
import com.arogya.entity.Order;

public class FetchOrder {
	
	 public static List<Order>  getOrderDetails(){
		  List<Order> lst = new ArrayList<Order>();
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
        pstmt= con.prepareStatement("select * from customerorder");

   	 rs= pstmt.executeQuery();
        
   	 while(rs.next()){
   		
   		Order ord = new Order();
   		ord.setCustorder_id(rs.getString(1));
   		ord.setSubcat_id(rs.getString(2));
   		ord.setCustomer_id(rs.getString(3));
   		ord.setOrder_quantity(rs.getString(4));
   		ord.setOrder_address_street(rs.getString(5));
   		ord.setOrder_address_state(rs.getString(6));
   		ord.setOrder_address_pincode(rs.getString(7));
   		 
   		 lst.add(ord);
   		 
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
