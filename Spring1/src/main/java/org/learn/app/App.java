package org.learn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1  = (Alien) context.getBean("alien1");
//        inject the setter throw xml file
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
    }
}
