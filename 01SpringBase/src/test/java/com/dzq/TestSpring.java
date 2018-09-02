package com.dzq;

import com.dzq.pojo.Student;
import com.dzq.pojo.Student1;
import com.dzq.service.UserService;
import com.dzq.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestSpring {


    @Test
    public void testSpring1() {
        UserService userService = new UserServiceImpl();
        userService.SaySpring();
    }

    /**
     * spring管理方式
     * 我们所有的操作 （对象的创建）、交给了Spring容器
     */
    @Test
    public void testSpring() {
        //加载容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-base.xml");
        //获取指定对象
        UserService service = context.getBean(UserService.class);
        //使用对象的方法
        service.SaySpring();
    }


    @Test
    public void testspring2() {
        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("Spring-base.xml"));
        System.out.println("===============================");
        //获取指定的对象
        UserService service = (UserService) context.getBean("userService");
        //使用对象的方法
        service.SaySpring();
    }


    @Test
    /**
     * 将resources包里面的Spring-base.xml剪切 放在指定的目录下面 这个时候resources里面的为空不再存在Spring-base.xml文件
     * 即可测试
     */
    public void testContextPath() {
        //加载容器
        ApplicationContext context = new FileSystemXmlApplicationContext("e:/Spring-base.xml");
        System.out.println("==================================");
        //获取指定的对象
        UserService service = (UserService) context.getBean("userService");
        //使用对象的方法
        service.SaySpring();
    }

    /**
     * 实例二
     */

    @Test
    public void testStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-base.xml");
        System.out.println("==============================");
        //获取指定的对象
        Student student1 = (Student) context.getBean("student");
        student1.setStuid(1);
        student1.setStuName("嘿嘿");
        System.out.println("student1==>>" + student1);
        Student student2 = (Student) context.getBean("student");
        System.out.println("student2==>>" + student2);
        System.out.println(student1 == student2);
    }

    /**
     * 实例三
     */
    @Test
    public void testStudent1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-base.xml");
        System.out.println("==============================");
        //获取指定的对象
        Student student1 = (Student) context.getBean("student");
        System.out.println("student1==>>" + student1);
    }


    /**
     * 实例四
     */
    @Test
    public void testStudent2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-base.xml");
        System.out.println("==============================");
        //获取指定的对象
        Student1 student1 = (Student1) context.getBean("student1");
        Student1 student2 = (Student1) context.getBean("student2");
        System.out.println("student1==>>" + student1);
        System.out.println("student2==>>" + student2);
    }

    /**
     * 实例五 =========properties
     */
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-base.xml");
        System.out.println("==============================");
        //获取指定的对象
        Student student = (Student) context.getBean("student");
        Map map = student.getMap();
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
    }

    /**
     * 测试属性赋值
     */
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-base.xml");
        System.out.println("==============================");
        //获取指定的对象
        Student student = (Student) context.getBean("student");
        System.out.println(student.getTeacher());
    }


    /**
     * 测试  Spring-autowrie.xml 的效果
     */
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-autowrie.xml");
        System.out.println("==============================");
        //获取指定的对象
        Student student = (Student) context.getBean("student");
        System.out.println(student.getTeacher());
    }

    /**
     * 使用注解完成自动装配
     */
    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-autowrie.xml");
        System.out.println("==============================");
        //获取指定的对象
        UserService service = (UserService) context.getBean(UserService.class);
        service.SaySpring();
    }
}
