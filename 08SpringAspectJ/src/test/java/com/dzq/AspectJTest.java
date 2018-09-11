package com.dzq;

import com.dzq.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 秋风伊人
 * @date 2018/9/11 9:50
 * @desc https://www.cnblogs.com/3020815dzq/
 */

/**
 * 使用注解实现
 */
public class AspectJTest {
@Test
    public void dafaultTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-AspectJ.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);
        dao.sleep();
    }
}
