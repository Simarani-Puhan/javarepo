package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args) {

        IMyCalculator iMyCalculator=(int x,int y)->{
            return x+y;
        };
        System.out.println(iMyCalculator.calculate(20,10));

        iMyCalculator=(x,y)->x*y;
    }
}
