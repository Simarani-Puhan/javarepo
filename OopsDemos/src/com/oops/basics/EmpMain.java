package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        Employee employee=new Employee("Shalini",1,2000);
        employee.employeeName="Sima";
        employee.employeeId=10;
        employee.salary=2000.5;
        employee.getDetails();
        String msg=employee.greet("Have a good day");
        System.out.println(msg);

        System.out.println("Name:"+employee.employeeName);
        System.out.println("Id:"+employee.employeeId);
        System.out.println("Salary:"+employee.salary);
    }
}
