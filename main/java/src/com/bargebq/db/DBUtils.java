package com.bargebq.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	
	//Connecting to database and returns said connection. This is specific to 
	//the LAN database.
	public static Connection getConnection() throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/project1","larry","larryboy");
		return con;
	}
	
}
