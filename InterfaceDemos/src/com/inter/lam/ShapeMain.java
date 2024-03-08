package com.inter.lam;

public class ShapeMain {
    public static void main(String[] args) {
        ShapFactory shapFactory=new ShapFactory();

        IShape iShape=new Rectangle();

        shapFactory.printArea(iShape,20,10);


        shapFactory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Calculating area");
                System.out.println("Tri "+(x*y*0.5));

            }
        }, 10, 40);
        shapFactory.printArea((int x, int y)->{
            System.out.println("Calculating sq area");
            System.out.println("Sq "+(x*x));
        },2,4);
    }
}
