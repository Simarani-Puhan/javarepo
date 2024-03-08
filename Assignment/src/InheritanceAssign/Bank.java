package InheritanceAssign;

public class Bank {

    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount){
        double withdrawamount=balance-amount;
        balance=withdrawamount;
    }

    void deposit(double amount){
        double depositamount=balance+amount;
        balance=depositamount;
    }

    double getBalance(){
        return balance;
    }
}
