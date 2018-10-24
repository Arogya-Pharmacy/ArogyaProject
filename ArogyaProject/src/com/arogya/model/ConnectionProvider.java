package com.arogya.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
static String ip="204.246.56.99";
static String driverClass="net.sourceforge.jtds.jdbc.Driver";
static String dbName="arogyadatabase";
static String userName="arogyadatabase";
static String password="arogya@123";
public static Connection CONN(){
	Connection con=null; 

	try{
		Class.forName(driverClass);
		con=DriverManager.getConnection( "jdbc:jtds:sqlserver://" + ip + ";"
		               + "databaseName=" + dbName + ";user=" + userName + ";password="
		               + password + ";");
	}catch(Exception e){
		e.printStackTrace();
	}
	return con;
}
}
