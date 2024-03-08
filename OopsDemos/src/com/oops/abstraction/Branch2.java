package com.oops.abstraction;

public abstract class Branch2 extends Bank{

    @Override
    void housingLoan() {
        System.out.println("Housing loan in branch2");
    }

    @Override
    void eduLoan() {
        System.out.println("Education loan in branch2");
    }

    void loanType(){
        System.out.println("Loan type in branch2");
    }
}