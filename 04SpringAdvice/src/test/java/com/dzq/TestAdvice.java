package com.dzq;

import com.dzq.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdvice {
    ApplicationContext context = null;
    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("Spring-Advice.xml");
    }
    /**
     * 前置增强 后置增强 环绕增强
     * 公有的测试类
     */
    @Test
    public void testAdvice() {
        //设置之前的逻辑访问service
        // UserService userService = (UserService) context.getBean("userServiceImpl");
        UserService userService = (UserService) context.getBean("adviceFactory");
        String result = userService.eat();
        //System.out.println(result);
    }


    /**
     * 异常增强
     * 在UserServiceImpl里面写一个错误的方法
     *  执行报错异常处理
     */
    @Test
    public void testAdviceException() {
        //设置之前的逻辑访问service
        // UserService userService = (UserService) context.getBean("userServiceImpl");
        UserService userService = (UserService) context.getBean("adviceFactory");
        String result = userService.eat();
        //System.out.println(result);
    }
}
