package com.oops.abstraction;

public class Branch1 extends Bank{

    @Override
    void carLoan() {
        System.out.println("Car loan in branch1");
    }

    @Override
    void housingLoan() {
        System.out.println("Housing loan in branch1");
    }

    @Override
    void eduLoan() {
        System.out.println("Education loan in branch1");
    }
    //branch1 method
    void staffDetails(){
        System.out.println("Staff in branch1");
    }
}
