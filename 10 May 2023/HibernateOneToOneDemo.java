package com.hibernateonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateOneToOneDemo 
{
	public static void main(String[] args) 
	{
		
	    System.out.println("project has satrted");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
    
        Department d1=new Department();
        d1.setDid(201);
        d1.setDname("Manifacturing");
    
        Department d2=new Department();
        d2.setDid(202);
        d2.setDname("sales");
    
        Department d3=new Department();
        d3.setDid(203);
        d3.setDname("HR");
    
    
        Employee e1=new Employee();
        e1.setEid(101);
        e1.setEname("Ravi");
        e1.setDept(d1);
    
       Employee e2=new Employee();
       e2.setEid(102);
       e2.setEname("Neha");
       e2.setDept(d2);
    
       Employee e3=new Employee();
       e3.setEid(103);
       e3.setEname("Vishal");
       e3.setDept(d3);
       Session s=factory.openSession();
       Transaction tx=s.beginTransaction();
       s.save(d1);
       s.save(d2);
       s.save(d3);
       s.save(e1);
       s.save(e2);
       s.save(e3);
       tx.commit();
       s.close();
       factory.close();
	}
    

}
