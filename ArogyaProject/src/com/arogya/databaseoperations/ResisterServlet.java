package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.arogya.connection.GetCon;
import com.arogya.entity.Entity;

public class ResisterServlet {
	
	public boolean check(Entity entity) throws SQLException{
		GetCon gc=new GetCon();
		Connection con=gc.getCon();
		if(con==null){
			System.out.println("not connected");
		}else{
			PreparedStatement ps;
			try {
				ps = con.prepareStatement("select * from customer where customer_email=?");
				
				ps.setString(1, entity.getEmail());
				ResultSet rs=ps.executeQuery();
				
				if(rs.next()){
					return true ;
				}
				
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		}
		return false;
	}


	public boolean register(Entity entity) throws SQLException {
		// TODO Auto-generated method stub
		GetCon gc=new GetCon();
		Connection con=gc.getCon();
		if(con==null){
			System.out.println("not connected");
		}
		else{
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into registration(name,email,password,phonenumber,role_id) values(?,?,?,?,?)");
			ps.setString(1, entity.getName());
			ps.setString(2, entity.getEmail());
			ps.setString(3, entity.getPassword());
			ps.setInt(5, entity.getType());
			ps.setInt(4, entity.getPhonenumber());
			int rowCount=ps.executeUpdate();
			
			if(rowCount>0){
				return true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
		return false;
	}
	
	
}
