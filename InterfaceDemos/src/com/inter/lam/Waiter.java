package com.inter.lam;

public class Waiter {
    void availableItems(IMenu iMenu){
        System.out.println("Welcome to my hotel");
        iMenu.showMenus();
        System.out.println(("Order now"));
    }
}
