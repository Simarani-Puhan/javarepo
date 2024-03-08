package com.thread.basic;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println(thread);
        thread.setName("Poppy");
        thread.setPriority(Thread.MIN_PRIORITY+6);
        System.out.println("Sam");

        int[]  nums=null;
        System.out.println(nums[0]);
    }
}
