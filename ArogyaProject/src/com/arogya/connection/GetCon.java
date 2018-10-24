package com.arogya.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class GetCon {
static String ip ="204.246.56.99";
static String driverClass = "net.sourceforge.jtds.jdbc.Driver";
static String db = "arogyadatabase";
static String un = "arogyadatabase";
static String pass = "arogya@123";

 
public Connection getCon(){
	Connection con=null;
	
	try {
		Class.forName(driverClass);
		con=DriverManager.getConnection( "jdbc:jtds:sqlserver://" + ip + ";"
				+ "databaseName=" + db + ";user=" + un + ";password="
				+ pass + ";");
		return con;
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		System.out.println("Exception in GetCon");
	}
	
	return null;
}
}
