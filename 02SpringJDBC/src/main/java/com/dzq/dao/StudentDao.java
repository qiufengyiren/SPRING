package com.dzq.dao;

import com.dzq.pojo.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentDao {
    //添加
    int add(Student student);

    //删除
    int delete(Serializable id);

    //更新
    int update(Student student);

    //查询
    List<Student> findAllList();
}
