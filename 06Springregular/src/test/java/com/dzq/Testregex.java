package com.dzq;

import com.dzq.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testregex {
    /**
     * 前置增强 后置增强 环绕增强
     * 公有的测试类
     */
    @Test
    public void testregex() {
        ApplicationContext context = new ClassPathXmlApplicationContext("regex.xml");
        UserDao userDao=context.getBean("userProxy",UserDao.class);
        userDao.eat();
        userDao.sleep();
        userDao.e();
        userDao.ea();
    }
}