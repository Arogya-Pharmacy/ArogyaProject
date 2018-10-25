package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.arogya.connection.GetCon;
import com.arogya.entity.ProductSub;

public class ProductSubdao {
	public List getproductsubbyid(int id) throws SQLException  {
		GetCon gc=new GetCon();
		Connection con=gc.getCon();
		
		if(con==null){
			System.out.println("not connected");
		}else{
			PreparedStatement ps=con.prepareStatement("select * from productsubcategory where product_subcat_id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			List al=new ArrayList();
			ProductSub psub = new ProductSub();
			while(rs.next()){
				
				psub.setProdsubid(rs.getInt(1));
				psub.setProdsubname(rs.getString(2));
				psub.setProdsubcost(rs.getInt(3));
				psub.setImages(rs.getString(5));
				psub.setProdsubcost(rs.getInt(6));
				al.add(psub);
				return al;
			}
		
		
		
		
		
	}
		return null;
}
}