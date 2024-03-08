package com.thread.basic;

public class Demo {
    public static void main(String[] args) {
        Runnable task=()->{
            System.out.println("Task1");
        };
        Thread thread=new Thread(task,"Pop");
        Thread thread1=new Thread(()->{
            System.out.println("Task2");
        },"Top");
        thread.start();
        thread1.start();
    }
}
