package com.inter.lam;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape shape=(int x, int y)->{
            System.out.println(x*y);
        };
        shape.area(20,10);
        shape=(x, y) -> System.out.println("Rectangle Area:"+(x*y));
        shape.area(10,8);
    }
}
