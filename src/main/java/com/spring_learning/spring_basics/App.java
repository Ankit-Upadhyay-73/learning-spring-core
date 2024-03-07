package com.spring_learning.spring_basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext factory = new AnnotationConfigApplicationContext(ApplicationConfig.class);    	
    		Samsung j2 = factory.getBean(Samsung.class);
    		j2.config();
    }
}
