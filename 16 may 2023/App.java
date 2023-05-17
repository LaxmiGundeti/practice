package com.spring.springproject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	Employee emp1=(Employee)context.getBean("e1");
    	System.out.println(emp1);
    	Employee emp2=(Employee)context.getBean("e2");
    	System.out.println(emp2);
    }
}
