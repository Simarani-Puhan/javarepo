package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu iMenu=()->{
            System.out.println("Chowemin-chinese");
            System.out.println("Roll-chinese");
            System.out.println("Manchurian-chinese");
        };
        iMenu.showMenus();

        IMenu iMenu1=()->{
            System.out.println("dosa-Indian");
            System.out.println("Vada-Indian");
            System.out.println("Idli-Indian");
        };
        iMenu1.showMenus();

        IMenu iMenu2=()->{
            System.out.println("Italian");
            System.out.println("Italian");
            System.out.println("Italian");
        };
        iMenu2.showMenus();
    }
}
