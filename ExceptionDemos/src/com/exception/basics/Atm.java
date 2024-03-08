package com.exception.basics;

public class Atm {
    public static void main(String[] args) throws Exception {
        Bank bank=new Bank();
        try {
            bank.withdraw(2200);
            System.out.println("Amount withdrawn");
        }catch(Exception e) {
            System.out.println("Exception..");
            System.out.println(e.getMessage());
        }
        System.out.println("Goodbye");
    }
}
