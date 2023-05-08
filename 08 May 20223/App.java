package com.product.ProductProject;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	
    	try
    	{
    	
    		ProductInformation pro=new ProductInformation();
    		ProductInformation obj=new ProductInformation();
    		Connection con=obj.creatconnection();//connecting to database 
    		if(con.isClosed())
    		{
    			System.out.println("Connection is not establised");
    		}
    		else
    		{
    			System.out.println("Connection is establised");
    		}
    		//Creating the book table
    	//	String q="create table product1(pid int primary key,pname varchar(50) not null,price varchar(50),p_desc varchar(200))";
    	//	Statement  stmt=con.createStatement();
    	//	stmt.executeUpdate(q);
    	//	System.out.println("The table is created");
    		//taking input from user to perform oprations
    		System.out.println("Enter which sql quary you want to perform:");
    		System.out.println("1.Insert");
    		System.out.println("2.Update");
    		System.out.println("3.delete");
    		System.out.println("4.View The Data");
    		System.out.println("Enter your choice:");
    		int no;
    		no=sc.nextInt();
    		
    		switch (no) 
    		{
			case 1:pro.insertq();//insertion operation
				break;
			case 2:pro.updateq();//Update operation
				break;
			case 3:pro.deleteq();//delete operation
				break;
			case 4:pro.viewdata();//view the data available on table
				break;
			default:
				System.out.println("wrong input!!!");
				break;
			}
    		
    	}
      
    	catch (Exception e) 
    	{
			System.out.println(e);
		}
}

    
       
}
