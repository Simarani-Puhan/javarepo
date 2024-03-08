package com.exception.custom;

public class CustomBank {
    double balance;

    public CustomBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws NegativeBalanceException, OutOfLimitsException {
        System.out.println("In withdraw method");
        try{
            if(balance-amount<=0)
                throw new NegativeBalanceException("Balance is negative");
            if(amount>1000){
                throw new OutOfLimitsException("Limit exceeded");
            }
            balance=balance-amount;
            System.out.println("Balance "+balance);
        } catch (NegativeBalanceException e) {
            System.out.println("exception.."+e.getMessage());
            throw e;
        } catch (OutOfLimitsException e) {
            System.out.println("exception.."+e.getMessage());
            throw e;
        }finally {
            System.out.println("Close db");
        }
        System.out.println("Work done");
    }
}
