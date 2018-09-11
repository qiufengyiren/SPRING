package com.dzq;

import com.dzq.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 秋风伊人
 * @date 2018/9/9 10:23
 * @desc https://www.cnblogs.com/3020815dzq/
 */
public class defaultTest {
    @Test
    public void testProxyServer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ProxyServer.xml");
        UserDao dao = context.getBean("userDao2", UserDao.class);
        dao.eat();
        dao.sleep();
    }
}