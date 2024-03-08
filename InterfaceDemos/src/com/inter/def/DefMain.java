package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator iBonusCalculator=new CalculatorImpl();
        iBonusCalculator.calculate(2000);
        iBonusCalculator.policyType();
        IBonusCalculator.show();

        IAllowanceCalculator allowanceCalculator=(IAllowanceCalculator) iBonusCalculator;
        allowanceCalculator.calculate(1000);
        allowanceCalculator.policyType();
    }
}
