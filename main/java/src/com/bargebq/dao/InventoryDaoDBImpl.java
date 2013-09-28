package com.bargebq.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bargebq.db.DBUtils;


public class InventoryDaoDBImpl implements InventoryDao {


	
	public InventoryDaoDBImpl(){
		
	}//Constructor for the InventoryDaoDBImpl class
			
	@Override
	public ArrayList<String> getData() {
		
		ArrayList<String> returnArray = new ArrayList<String>();
	
		Statement statement = null;
		//ResultSet result = null;
		String sqlStatement = "SELECT * FROM Contacts;";
		Connection con = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("class could not connect with driver");
			e1.printStackTrace();
		}
				
		try {
			
			con = DBUtils.getConnection();
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sqlStatement);
		
			while(rs.next()){
				String firstname = rs.getString(1);
				//System.out.println(firstname);
				returnArray.add(firstname);
				
			}
		} catch (SQLException e) {
			System.err.println("Caught SQL Exception in connecting and result set:" + e.getMessage());
			e.printStackTrace();			
		}
		try {
			con.close();
		} catch (SQLException e) {
			System.err.println("Caught SQL Exception in con.close:" + e.getMessage());
			e.printStackTrace();
			
		}
		return returnArray;
	}
}
