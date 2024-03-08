package com.oops.inheritance.staticEx;

public class Demo {
    static{
        System.out.println("In demo static block");
    }
    public static void main(String[] args) {
        System.out.println("Main demo");

        try {
            Class.forName("com.oops.inheritance.staticEx.Trail");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Trail.getMessage();
        System.out.println(Trail.x+Trail.y);


    }
}
