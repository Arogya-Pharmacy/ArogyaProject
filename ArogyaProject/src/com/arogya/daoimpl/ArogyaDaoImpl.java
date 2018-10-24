package com.arogya.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.arogya.connection.GetCon;
import com.arogya.entity.Entity;

public class ArogyaDaoImpl {

	public boolean check(Entity entity){
		GetCon gc=new GetCon();
		Connection con=gc.getCon();
		if(con==null){
			System.out.println("not connected");
		}else{
			PreparedStatement ps;
			try {
				ps = con.prepareStatement("select * from customer where email=?");
				
				ps.setString(2, entity.getEmail());
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

	public boolean register(Entity entity) {
		// TODO Auto-generated method stub
		GetCon gc=new GetCon();
		Connection con=gc.getCon();
		if(con==null){
			System.out.println("not connected");
		}
		else{
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into customer(customer_name,customer_email,customer_password,customer_phoneno) values(?,?,?,?)");
			ps.setString(1, entity.getName());
			ps.setString(2, entity.getEmail());
			ps.setString(3, entity.getPassword());
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
