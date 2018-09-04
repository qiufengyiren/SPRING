package com.dzq.dao;

import com.dzq.pojo.Student;
import com.dzq.pojo.StudentMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

    /**
     * 添加
     * 调用update
     */
    @Override
    public int add(Student student) {
        String sql = "INSERT INTO`student` (`sname`,`age`) VALUES (?,?)";
        return getJdbcTemplate().update(sql, student.getSname(), student.getAge());
    }

    /**
     * 删除
     * 调用update
     */
    @Override
    public int delete(Serializable id) {
        String sql = "DELETE FROM `student` WHERE `sid`=?";
        return getJdbcTemplate().update(sql, id);
    }

    /**
     * 修改
     * 调用update
     */
    @Override
    public int update(Student student) {
        String sql = "UPDATE `student` SET `sname`=? WHERE `sid`=?";
        return getJdbcTemplate().update(sql, student.getSname(), student.getSid());
    }

    /**
     * 查询
     *
     * @return
     */
    @Override
    public List<Student> findAllList() {
        String sql = "SELECT `sid`,`sname`,`age` FROM `student`";
        /**
         * 切记:
         * 此处调用的是
         * query
         * 之前的增删改 调用的是update
         */
        return getJdbcTemplate().query(sql, new RowMapper<Student>() {
            /**
             * 方式一：
             * StudentMapper就是为了测试查询写的一个实体类
             * 直接在StudentMapper里面实现查询
             * 然后编辑测试类
             * 两种方式的测试类无需改动
             */


            /**
             * 方式二
             * 将StudentMapper里面的代码拿到studentDaoImpl的实现方法里边
             * 写的是 sql, new RowMapper<Student>()
             * 测试类保持不变
             *方式二
             * sql, new RowMapper<Student>()
             * 此处要重写方法
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
        });
    }
}
