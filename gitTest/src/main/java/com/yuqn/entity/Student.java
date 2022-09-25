package com.yuqn.entity;

public class Student {
    private String stuName;
    private String stuSex;
    private Integer stuAge;

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }
}
