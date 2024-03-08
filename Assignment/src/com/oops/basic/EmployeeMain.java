package com.oops.basic;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee=new Employee("John","Programmer");
       double d=employee.calcBonus(2000) ;
        System.out.println(d);

       Employee employee1=new Employee("Ram","Manager");
       double d1=employee1.calcBonus(1000,200,"Car");
        System.out.println(d1);

       Employee employee2=new Employee("Raj","Director");
       double d2=employee2.calcBonus(200,"Ram",599,500);
        System.out.println(d2);

        }

}
