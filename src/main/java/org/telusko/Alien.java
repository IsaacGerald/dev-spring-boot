package org.telusko;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;

    private int salary;
    private Laptop lap;


    public Alien(){
        System.out.println("Object created");
    }

    @ConstructorProperties({"age", "lap"})
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }


    public void code(){
        System.out.println("Coding");
        lap.compile();
    }

}
