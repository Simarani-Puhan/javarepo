package com.thread.basic;

class Runner implements Runnable{
    String name;
    Greetings grettings;

    public Runner(String name, Greetings grettings) {
        Thread t= new Thread(this,name);
        this.name = name;
        this.grettings = grettings;
        t.start();
    }
    @Override
    public void run() {
        synchronized (grettings) {
            System.out.println(grettings.sayHello(name));
            System.out.println("Done");
        }
    }
}
public class RunThread {
    public static void main(String[] args) {
       Greetings greetings=new Greetings();
       Runner runner1=new Runner("Ram",greetings);
        Runner runner2=new Runner("Sam",greetings);
        Runner runner3=new Runner("John",greetings);
        Runner runner4=new Runner("Tom",greetings);
    }
}
