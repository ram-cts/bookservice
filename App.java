package com.core.student;

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
    	 ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
    	 StudentPojo bean = context.getBean(StudentPojo.class);
    	System.out.println(bean.getName());
    	System.out.println(bean.getAddress());
    	 System.out.println(bean.getEntity());
    	
    }
}
