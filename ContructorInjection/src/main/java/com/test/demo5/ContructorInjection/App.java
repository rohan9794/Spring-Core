package com.test.demo5.ContructorInjection;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("EmpBean.xml");
        Employee emp = (Employee)context.getBean("e");
        
        emp.displayEmpInfo();
    }
}
