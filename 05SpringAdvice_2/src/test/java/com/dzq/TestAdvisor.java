package com.dzq;

import com.dzq.dao.UserDao;
import com.dzq.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvisor {
    /**
     * 前置增强 后置增强 环绕增强
     * 公有的测试类
     */
    @Test
    public void testAdvice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Advisor.xml");
        UserDao userDao=context.getBean("userProxy",UserDao.class);
       //userDao.eat();
        userDao.sleep();

    }

}