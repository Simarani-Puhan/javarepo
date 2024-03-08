package InheritanceAssign;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {


        Bank bank =new Bank(120);
        Scanner sc=new Scanner(System.in);

            System.out.println("Enter the choice to deposit or withdraw :");
            String AS = sc.next();
            switch(AS){
                case "a": System.out.println("Enter amount  to withdraw ");
                    int withDrawAmt=sc.nextInt();
                    bank.withdraw(withDrawAmt);
                    System.out.println(bank.getBalance());
                   break;
                case "b": System.out.println("Enter amount to deposit");
                    int depositAmount=sc.nextInt();
                    bank.deposit(depositAmount);
                    System.out.println(bank.getBalance());
                    break;
                case "c": System.out.println("Balance is :"+bank.getBalance());
                    break;
               /*default:
                    System.out.println("Please choose the crt option");*/
            }
        }

}
