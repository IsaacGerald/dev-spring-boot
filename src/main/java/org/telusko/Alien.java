package org.telusko;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;

    private int salary;
    private Computer com;


    public Alien(){
        System.out.println("Alien Object created");
    }

//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void setAge(int age) {
        //System.out.println("Setter called");
        this.age = age;
    }


    public void code(){
        System.out.println("Coding");
        com.compile();
    }

}
