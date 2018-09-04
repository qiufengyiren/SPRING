package com.dzq;

import com.dzq.dao.StudentDao;
import com.dzq.pojo.Student;
import com.dzq.pojo.TestValue;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentTest {
    StudentDao dao = null;
    TestValue value=null;

    @Before
    public void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-jdbc.xml");
        dao = context.getBean(StudentDao.class);
        value=context.getBean(TestValue.class);
    }

    /**
     * 添加
     */
    @Test
    public void add() {
        Student student = new Student();
        student.setSname("小黑");
        student.setAge(25);
        dao.add(student);
    }

    /**
     * 修改
     */
    @Test
    public void update() {
        Student student = new Student();
        student.setSid(1);
        student.setSname("小黑11");
        student.setAge(16);
        dao.update(student);
    }

    /**
     * 删除
     */
    @Test
    public void delete() {
        dao.delete(13);
    }

    /**
     * 查询方式一和方式二 测试类的方式不变
     */
    @Test
    public void select() {
        List<Student> list=dao.findAllList();
        for (Student student:list) {
            System.out.println(student);
        }
    }
    /**
     * 配置数据源  使用druid自带的数据源
     * 推荐使用
     */
    @Test
    public void test(){
        System.out.println(value.getName());
    }

}
