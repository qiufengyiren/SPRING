package com.dzq.pojo;

public class Student1 {
    private int stuid;
    private String stuName;

    public Student1(int stuid, String stuName) {
        this.stuid = stuid;
        this.stuName = stuName;
    }

    public Student1() {
    }

    @Override
    public String toString() {
        return "Student1{" +
                "stuid=" + stuid +
                ", stuName='" + stuName + '\'' +
                '}';
    }

    public int getStuid() {
        return stuid;
    }

    public String getStuName() {
        return stuName;
    }
}
