package com.product.ProductProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductInformation 
{
	GetConnection obj=new GetConnection();
	Connection con=obj.creatconnection();
	Scanner sc=new Scanner(System.in);
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
	public void insertq() throws SQLException  //method for adding the data
	{
		String q="insert into product1(pid,pname,price,p_desc) values(?,?,?,?)";
		PreparedStatement psmt=con.prepareStatement(q);
		System.out.println("Enter product Id:");
		int id= sc.nextInt();
		System.out.println("Enter product Name:");
		String name=sc.next();
		System.out.println("Enter product price:");
		int price=sc.nextInt();
		System.out.println("Enter product details:");
		String desc=sc.next();
		psmt.setInt(1,id);
		psmt.setString(2, name);
		psmt.setInt(3, price);
		psmt.setString(4,desc);
		psmt.executeUpdate();
		System.out.println("Data inserted successfully");
		con.close();
		
	}
	public void updateq() throws SQLException    //method for updating data on table
	{
		String q="update product1 set price=? where pid=?";
		PreparedStatement psmt=con.prepareStatement(q);
		System.out.println("Enter product Id to Update:");
		int id= sc.nextInt();
		System.out.println("Enter new price:");
		int price=sc.nextInt();
		psmt.setInt(1, price);
		psmt.setInt(2, id);
		psmt.executeUpdate();
		System.out.println("Data updated successefully");
		con.close();
		
	}
	public void deleteq() throws SQLException    //method for deleting data from table
	{
		String q="delete from product1 where pid=?";
		PreparedStatement psmt=con.prepareStatement(q);
		System.out.println("Enter product Id to Delete:");
		int id= sc.nextInt();
		psmt.setInt(1, id);
		psmt.executeUpdate();
		System.out.println("Data Deleted successefully");
		con.close();

    }
	public void viewdata() throws SQLException   //method to view data available on table
	{
		String q="select pid,pname,price,p_desc from product1 ";
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			int price=set.getInt(3);
			String desc=set.getString(4);
			System.out.println(id+"  "+name+"  "+price+"  "+desc);
			
		}
		
		con.close();//closing database connection
	}
	
}
