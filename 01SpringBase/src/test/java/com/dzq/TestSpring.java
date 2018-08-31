package com.dzq;

import com.dzq.service.UserService;
import com.dzq.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {



    @Test
    public void testSpring1(){
        UserService userService=new UserServiceImpl();
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
}
