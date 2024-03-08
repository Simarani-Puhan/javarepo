package com.util.map;

public class Department {
    private String deptHead;
    private Integer deptId;
    private String deptName;

    public Department() {
        super();
    }

    public Department(String deptHead, Integer deptId, String deptName) {
        super();
        this.deptHead = deptHead;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptHead='" + deptHead + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
