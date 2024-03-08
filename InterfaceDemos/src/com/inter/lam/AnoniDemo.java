package com.inter.lam;

public class AnoniDemo {
    public static void main(String[] args) {
        IGreeter iGreeter=new GreetImpl();
        iGreeter.greeetMessage("Welcome to Lamba");

        IGreeter iGreeter1=new IGreeter() {
            @Override
            public void greeetMessage(String message) {
                System.out.println(message);
            }
        };
        //call the method
        iGreeter1.greeetMessage("Great day");
    }
}
