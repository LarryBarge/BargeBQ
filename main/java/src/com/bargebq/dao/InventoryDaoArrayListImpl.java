package com.bargebq.dao;

import java.util.ArrayList;

public class InventoryDaoArrayListImpl implements InventoryDao {

	private ArrayList<String> dataArray= new ArrayList<String>();
	
	public InventoryDaoArrayListImpl(){
		super();
		dataArray.add("one");
		dataArray.add("two");
		dataArray.add("Three");
	}//Constructor for the InventoryDaoArrayListImpl Class
	
	
	
	@Override
	public ArrayList<String> getData(){
		return dataArray; 
	}
		
}
