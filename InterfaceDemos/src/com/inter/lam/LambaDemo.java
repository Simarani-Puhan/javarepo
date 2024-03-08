package com.inter.lam;

public class LambaDemo {
    public static void main(String[] args) {

        IGreeter greeter=(String message)->{
            System.out.println(message);
        };
        //call the method
        greeter.greeetMessage("Great day");
        greeter=message -> System.out.println(message+"!!!");
        greeter.greeetMessage("Wow");

    }
}
