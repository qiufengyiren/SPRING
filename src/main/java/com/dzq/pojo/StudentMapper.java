package com.dzq.pojo;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    /**
     *mapper ：行映射器
     * rs 不再是我们认为的结果集 而是一行数据
     * 当我们的结果集中有多条数据的时候 会反复执行费
     */

    /**
     * 查询的方式一：
     * 创建一个StudentMapper类 实现查询的功能
     * 此处重写方法
     * 然后编辑测试类
     * 两种方式的测试类无需改动
     */

    /**
     * 查询的方式二：
     * 不需要实体类StudentMapper 直接在StudentDaoImpl层里面的查询的重写方法里边写上 StudentMapper里面的
     * 此处调用的是 query
     * Student student=new Student();
     * student.setSid(rs.getInt("sid"));
     * student.setSname(rs.getString("sname"));
     * student.setAge(rs.getInt("age"));
     * return student;
     */
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        System.out.println("=========================");
        Student student = new Student();
        student.setSid(rs.getInt("sid"));
        student.setSname(rs.getString("sname"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}
