package org.learn.app;

public class Alien {

    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("Object created");
    }
    public void code(){
        lap.compile();
        System.out.println("Codding...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
