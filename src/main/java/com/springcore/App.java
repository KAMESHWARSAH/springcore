package com.springcore;

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
        System.out.println( "Hello World!" );
     ApplicationContext context=   new ClassPathXmlApplicationContext("config.xml");
     Student mystudent = (Student) context.getBean("mystudent");
     Student mystudent2 = (Student) context.getBean("mystudent2");
     System.out.println(mystudent);
     System.out.println(mystudent2);
    }
}
