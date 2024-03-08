package com.inter.lam;

public class ShapeDemo {
    public static void main(String[] args) {

        IShape iShape = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Area of rectangle:" + x * y);
            }
        };
        iShape.area(10, 20);

        IShape iShape1 = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Area of rectangle:" + x * y);
            }
        };
        iShape1.area(10, 5);

    }
}