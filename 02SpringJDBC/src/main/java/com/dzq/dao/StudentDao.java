package com.dzq.dao;

import com.dzq.pojo.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentDao {
    int add(Student student);
    int delete(Serializable id);
    int update (Student student);
    List<Student> findAllList();
}
