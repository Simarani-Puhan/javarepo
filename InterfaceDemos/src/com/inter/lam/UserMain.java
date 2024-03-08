package com.inter.lam;

public class UserMain {
    public static void main(String[] args) {
        Waiter waiter=new Waiter();
        waiter.availableItems(()-> System.out.println("1.Chole 2.Bhature"));
    }
}
