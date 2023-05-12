package com.hibernateonetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateOneToManyDemo
{
	public static void main(String[] args) 
	{

		System.out.println("project has satrted");
	       Configuration cfg=new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory=cfg.buildSessionFactory();
	       
	       Project1 p1=new Project1();
	       p1.setPid(501);
	       p1.setPname("School Management System");

	       Employee2 e1=new Employee2();
	       e1.setEid(101);
	       e1.setEname("Rahul");
	       e1.setProj(p1);
	       
	       Employee2 e2=new Employee2();
	       e2.setEid(102);
	       e2.setEname("Nikhil");
	       e2.setProj(p1);
	       
	       Employee2 e3=new Employee2();
	       e3.setEid(103);
	       e3.setEname("Pravin");
	       e3.setProj(p1);
	       
	       //creating a list of employees associate with project
	       List<Employee2> l1=new ArrayList<Employee2>();
	       l1.add(e1);
	       l1.add(e2);
	       l1.add(e3);
	       
	       //Associating the employees with project
	       p1.setEmp(l1);
	       
	       Session s=factory.openSession();
	       Transaction tx=s.beginTransaction();
	       s.save(p1);
	       s.save(e1);
	       s.save(e2);
	       s.save(e3);
	       
	       tx.commit();
	       s.close();
	       factory.close();
	       
	       
	}


}
