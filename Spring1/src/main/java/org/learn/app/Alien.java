package org.learn.app;

public class Alien {

    private int age;
    public Alien(){
        System.out.println("Object created");
    }
    public void code(){
        System.out.println("Codding...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }
}
