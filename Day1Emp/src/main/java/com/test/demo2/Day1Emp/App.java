package com.test.demo2.Day1Emp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource resource = new ClassPathResource("ApplicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        
        Employee emp1 = (Employee)factory.getBean("empBean");
//        emp1.setName(name);
//        emp1.getName();
        emp1.displayInfo();
        
        Employee emp2 = (Employee)factory.getBean("empBean1");
//        emp2.setName("Rohan");
        emp2.displayInfo();
    }
}
