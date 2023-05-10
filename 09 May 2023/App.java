package com.hibernate.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Project has started!!" );
        Configuration cfg=new Configuration();    
        cfg.configure("hibernate.cfg.xml");   //configuring the xml file
        SessionFactory factory=cfg.buildSessionFactory();    //creating session factory
        
        Student s1= new Student();    //creating object
        s1.setSid(104);        //assigning values through no- argument constructor
        s1.setSname("Aboli"); 
        s1.setSage(21);
        
        Session session=factory.openSession();    //starting the session
        Transaction tx=session.beginTransaction();          //to begin transaction
        session.save(s1);     //save changes to the session
        tx.commit();     //committing transactions
        session.close();   //closing session
        factory.close();     //ending session factory
        System.out.println("Process Completed successfully!!");
    }
    
        
}
