package com.dzq.pojo;

public class Teacher {
    private int teaid;
    private String teaName;

    public Teacher() {
    }

    public Teacher(int teaid, String teaName) {
        this.teaid = teaid;
        this.teaName = teaName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaid=" + teaid +
                ", teaName='" + teaName + '\'' +
                '}';
    }

    public int getTeaid() {
        return teaid;
    }

    public void setTeaid(int teaid) {
        this.teaid = teaid;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }
}
