package com.exception.custom;

public class CustomAtm {
    public static void main(String[] args)  {
        System.out.println("In ATM");
        CustomBank bank=new CustomBank(200);
        try{
            bank.withdraw(100.0);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }catch (OutOfLimitsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBye");
    }
}
