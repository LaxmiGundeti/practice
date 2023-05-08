package com.product.ProductProject;

import java.sql.Connection;
import java.sql.DriverManager;


public class GetConnection {
	public Connection creatconnection()
	{
		String url="jdbc:mysql://localhost:3306/school";
    	String user="root";
    	String password="1234";
    	try
    	{
    		Connection con=DriverManager.getConnection(url, user, password);
    		return con;
   		
    	}
    	catch (Exception e) 
    	{
			System.out.println(e);
			return null;
		}
	}

}
