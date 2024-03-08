package com.oops.overloading;

public class OverloadMain {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.clacArea(10);
        shape.clacArea(20);

        int rect=(int)shape.calcArea(10,20);
        System.out.println("Rect "+rect);
        double tri=shape.calcArea(10.0,5);
        System.out.println("Tri "+tri);
    }
}
