package com.API.io.serial;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 3L ;
    private String StuName;
    private int StuId;
    private transient String StuDept;


    public Student() {
    }

    public Student(String stuName, int stuId, String stuDept) {
        StuName = stuName;
        StuId = stuId;
        StuDept = stuDept;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getStuId() {
        return StuId;
    }

    public void setStuId(int stuId) {
        StuId = stuId;
    }

    public String getStuDept() {
        return StuDept;
    }

    public void setStuDept(String stuDept) {
        StuDept = stuDept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StuName='" + StuName + '\'' +
                ", StuId=" + StuId +
                ", StuDept='" + StuDept + '\'' +
                '}';
    }
}
