package org.telusko;

public class Laptop implements Computer {

//    public Laptop(){
//        System.out.println("Laptop object create");
//    }

    @Override
    public void compile(){
        System.out.println("Compiling using laptop");
    }
}
