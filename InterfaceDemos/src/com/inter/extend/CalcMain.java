package com.inter.extend;

import com.inter.IScientific;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator iCalculator=new BasicCalculator();
        iCalculator.add(10,20);
        iCalculator.product(100,200);

        IScientific calculator=new ScientificCalc();
        calculator.add(10,20);
        calculator.product(100,200);
        calculator.square(2);
        calculator.cube(3);
    }
}
