package com.thread.basic;

class Child extends Thread {
    public Child(String name, int priority) {
        super();
        System.out.println(this);
       // this.start();
    }
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            String name=Thread.currentThread().getName();
            System.out.println(i + "X" + i + "=" + (i * 5)+" "+name);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class ExThread {
    public static void main(String[] args) {
//        Child child1 = new Child("child1",10);
//        child1.setName("child1");

       Child child2 = new Child("child2",20);
       child2.setDaemon(true);
      // child2.setName("child2");
       child2.start();
//        Child child3 = new Child("child3",30);
//        child3.setName("child3");
       System.out.println();
        for (int i = 1; i < 11; i++) {
            String name=Thread.currentThread().getName();
            System.out.println(i + "X" + i + "=" + (i * 10)+" "+name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        try {
////            child1.join();
////            child2.join();
////            child3.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("Main Completed");
    }
}
