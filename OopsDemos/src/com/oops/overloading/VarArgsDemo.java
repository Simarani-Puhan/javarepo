package com.oops.overloading;

public class VarArgsDemo {
    void calcSum(String name, int... marks) {
        System.out.println("Welcome " + name);
        int sum = 0;
        for (int mark : marks)
            sum += mark;
        System.out.println("Sum " + sum);
    }

    void calcSum(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        VarArgsDemo demo = new VarArgsDemo();
        demo.calcSum("Sid", 60, 68, 70);
        demo.calcSum("Ram");
        demo.calcSum("Raj", 10, 40);
    }
}