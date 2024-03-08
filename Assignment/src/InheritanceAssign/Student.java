package InheritanceAssign;

public class Student {

    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void printDetails(){


    }

    String getGrades(int... marks){
        int avg = 0;
        char grade;
        if(avg>=80){
            grade='A';
        }
        else if (avg>=60 && avg<80) {
            grade='B';
        }
        else if (avg>=40 && avg<60){
            grade='C';
        }else {
            grade='D';
        }

        return name;
    }
}
