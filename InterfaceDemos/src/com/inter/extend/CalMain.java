package com.inter.extend;

public class CalMain {
    public static void main(String[] args) {
        ICalculator iCalculator=new BasicCalculator();
        iCalculator.add(10,20);
        iCalculator.product(200,100);
    }
}
