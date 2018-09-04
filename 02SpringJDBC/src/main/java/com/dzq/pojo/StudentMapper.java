package com.dzq.pojo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        System.out.println("===========");
        Student student = new Student();
        student.setSname(rs.getString("sname"));
        student.setAge(rs.getInt("sid"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}
