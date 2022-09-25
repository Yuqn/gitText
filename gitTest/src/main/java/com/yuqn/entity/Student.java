package com.yuqn.entity;

public class Student {
    private String stuName;
    private Integer stuAge;
    private String stuSex;

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }
}
