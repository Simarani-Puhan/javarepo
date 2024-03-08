package InheritanceAssign;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student("Sid","CS");
        char grade1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter avg of your marks(Less than 100) :");
        int avg=sc.nextInt();

        System.out.println("Your grade is :");
    }
}
