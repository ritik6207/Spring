package org.learn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1  = (Alien) context.getBean("alien1");

//        Change the value of age
        obj1.age = 23;
        System.out.println(obj1.age);
//        obj1.code();


        Alien obj2  = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);
//        obj2.code();
    }
}
