package org.learn.app;


import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component

public class Alien {

    private int age;
    private Computer com;
    public Alien(){
        System.out.println("Alien Object created....");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public void code(){
        System.out.println("Codding...");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
}
