
package com.arogya.databaseoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.arogya.connection.GetCon;
import com.arogya.model.ConnectionProvider;
import com.arogya.model.OrderPojo;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class FetchArogyaDetails {

	public int FetchArogyaDetailsCon(int subCatId,int quantity) {
		GetCon databaseconnection = new GetCon();
		Connection con = databaseconnection.getCon();
		int count = 0;
		if (con == null) {
			System.out.println("Not Connected,Please check your db connection");
		} else {
			String query = "select product_subcat_quantity from productsubcategory where product_subcat_id="+subCatId+" and product_subcat_quantity>="+quantity;
			try {
				PreparedStatement psmt = con.prepareStatement(query);
				ResultSet result = psmt.executeQuery();

				while (result.next()) {
					count = result.getInt(1);
					System.out.println("Available quantity : " + count);
					// System.out.println(result.getInt(1)+"--"+result.getString(2)+"--"+result.getDate(3));
				}
				result.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public Double FetchPriceAndQuantity(String subCatProdName, int prodRequestQuantity) {

		System.out.println("FETCHING PRICE");

		GetCon databaseconnection = new GetCon();
		Connection con = databaseconnection.getCon();
		Double price = 0.0;
		if (con == null) {
			System.out.println("Not Connected,Please check your db connection");
		} else {
			System.out.println(
					"entered in to else of fetchPriceAndQuantity  " + subCatProdName + " and " + prodRequestQuantity);
			String query = "select product_subcat_cost from productsubcategory where product_subcat_name='"
					+ subCatProdName + "' and product_subcat_quantity>=" + prodRequestQuantity;
			try {
				System.out
						.println("TRY catch of FetchPriceAndQuantity" + subCatProdName + " and " + prodRequestQuantity);
				PreparedStatement psmt = con.prepareStatement(query);
				ResultSet result = psmt.executeQuery();
				System.out.println("Query " + query);
				System.out.println("result.next() :: " + result.next());
				System.out.println("checking " + result.getInt(1));

				do {
					System.out.println("while of FetchPriceAndQuantity " + result.getInt(1));
					price = (double) result.getInt(1);
					System.out.println("Price in Fetching from DB  " + price);
				} while (result.next());
				result.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return price;
	}

	public int InsertOrderCode(String orderCode,int quantity,int subCatId) {
		System.out.println("INSERT data in to customer order table ");
		GetCon databaseconnection = new GetCon();
		Connection con = databaseconnection.getCon();
		int rowsAffected = 0;
		if (con == null) {
			System.out.println("Not Connected,Please check your db connection");
		} else {
			String query="insert into customerorder values("+subCatId+",8,"+quantity+",'"+orderCode+"')";
//			String query = "update customerorder set customer_order_code='" + orderCode + "' where email='rohini@gmail.com'";
			try {
				PreparedStatement psmt = con.prepareStatement(query);
				int result = psmt.executeUpdate();
				if (result==1) {
					rowsAffected = 1;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return rowsAffected;
	}

	public List<OrderPojo> FetchSubCat(int catId) {
		System.out.println("AT AUB CATEGORY PAGE");
		ArrayList<OrderPojo> al = new ArrayList<>();
		try {
			GetCon dbConnection = new GetCon();
			Connection con = dbConnection.getCon();

			if (con == null) {
				System.out.println("Not Connected,Please check your db connection");
			} else {
				String query = "select product_subcat_id,product_subcat_name,images,product_subcat_cost from productsubcategory where product_cat_id="+catId;
				System.out.println(query);
				try {
					PreparedStatement psmt = con.prepareStatement(query);
					ResultSet resultset = psmt.executeQuery();
					while (resultset.next()) {
						OrderPojo op = new OrderPojo();
						System.out.println(resultset.getInt(4) + " " + op.getProductSubcatCost());

						op.setProductSubcatId(resultset.getInt(1));
						op.setProductSubcatName(resultset.getString(2));
						op.setImage(resultset.getString(3));
						op.setProductSubcatCost(resultset.getInt(4));			
						System.out.println(resultset.getInt(4) + " " + op.getProductSubcatCost());
						al.add(op);
					}
					System.out.println(al);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return al;
	}
	
	public int UpdateQuantityInTable(int subCatId,int quantity){
		System.out.println("INSERT data in to customer order table ");
		GetCon databaseconnection = new GetCon();
		Connection con = databaseconnection.getCon();
		int rowsAffected = 0;
		if (con == null) {
			System.out.println("Not Connected,Please check your db connection");
		} else {
			String retrieve="select product_subcat_quantity from productsubcategory where product_subcat_id="+subCatId;
			try{
				PreparedStatement psmt1 = con.prepareStatement(retrieve);
				ResultSet result1 = psmt1.executeQuery();
				int totalQuant=0;
				while(result1.next()){
					totalQuant=result1.getInt(1)-quantity;
					if(totalQuant>0){
						String query="update productsubcategory set product_subcat_quantity="+totalQuant+" where product_subcat_id="+subCatId;
						try {
							PreparedStatement psmt = con.prepareStatement(query);
							int result = psmt.executeUpdate();
							if (result==1) {
								rowsAffected = 1;
							}
						} catch (Exception e) {
							System.out.println(e);
						}

					}
				}
			}catch(Exception e){
				System.out.println(e);
			}
					}
		return rowsAffected;
	}
}
