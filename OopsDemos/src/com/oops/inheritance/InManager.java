package com.oops.inheritance;

public class InManager extends InEmployee{

    double salary;

    public InManager(String employeename, int employeeId, double salary) {
        super(employeename, employeeId);
        this.salary = salary;
    }

    void printBonus(double amount){
        System.out.println("Bonus "+(amount+salary));
    }
}
