package com.thread.basic;

public class Greetings {
    String sayHello(String name){
        String result="Welcome"+name;
        try{
            Thread.sleep(1000);
            result="Great day "+name;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }
}
