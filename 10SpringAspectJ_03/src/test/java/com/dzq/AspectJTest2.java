package com.dzq;

import com.dzq.dao.UserDao;
import com.dzq.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 秋风伊人
 * @date 2018/9/11 9:50
 * @desc https://www.cnblogs.com/3020815dzq/
 */

/**
 * 使用纯切面的方法实现
 */
public class AspectJTest2 {


    @Test
    public void dafaultTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-AspectJ2.xml");
        UserService dao = (UserService) context.getBean("service");
        dao.eat();
    }


}
