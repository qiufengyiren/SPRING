package com.dzq.pojo;

import org.springframework.util.PropertiesPersister;

import java.io.Serializable;
import java.util.*;
public class Student  implements Serializable{
    private int stuid;
    private String stuName;
    private Teacher teacher;
    private int[] nums = new int[5];
    private List<String> list = new ArrayList<>();
    private Set<String> set = new HashSet<>();
    private Map map = new HashMap();
    private Properties properties = new Properties();

    public Student() {
    }

    public Student(int stuid, String stuName) {
        this.stuid = stuid;
        this.stuName = stuName;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuName='" + stuName + '\'' +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
