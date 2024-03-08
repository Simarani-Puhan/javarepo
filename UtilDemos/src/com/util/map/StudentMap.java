package com.util.map;

import java.util.*;

public class StudentMap {

    public static void main(String[] args) {
        Map<Department, List<Student>> map=new HashMap<>();
        Department department1=new Department("John",12,"Css");
        Department department2=new Department("Ram",20,"Biology");
        Department department3=new Department("Sam",30,"It");

        map.put(department1,Arrays.asList(new Student("Sima","Bangalore"),
                new Student("Jo","Mangaluru")));
        map.put(department2,Arrays.asList(new Student("Rima","Chennai"),
                new Student("Johny","Hyderabad")));
        map.put(department3,Arrays.asList(new Student("Ram","Bangalore"),
                new Student("Raj","Mangaluru")));

        Set<Department> departments=map.keySet();
        for (Department department:departments){
            System.out.println(department.getDeptHead()+" "+department.getDeptName());
            List<Student>students=map.get(department);
            for (Student student:students){
                System.out.println(student.getStudName());
            }
        }
    }
}
