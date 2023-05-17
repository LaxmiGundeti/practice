package com.spring.springproject;

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
    	
    	Student std1=(Student)context.getBean("s1");
    	System.out.println(std1);
    }
}
