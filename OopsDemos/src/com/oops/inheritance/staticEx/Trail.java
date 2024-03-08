package com.oops.inheritance.staticEx;

public class Trail {

    static  int x;
    static int y=10;

    static{
        System.out.println("In static block1");
        x=200;
    }
    static{
        System.out.println("In static block2");
        x=200;
    }
    static void getMessage(){
        System.out.println("In static method");
        System.out.println("Sum "+(x+y));
    }

    public static void main(String[] args) {
        System.out.println("In main");
        getMessage();      //call static method directly
        System.out.println("Sum "+(x+y));
    }
}
