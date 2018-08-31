package com.dzq.service;

import com.dzq.dao.UserDao;
import com.dzq.dao.UserDaoImpl;

import java.io.PrintWriter;

public class UserServiceImpl implements UserService {
    /**
     * 之前的耦合
     * private  UserDao dao =new UserDaoImpl();
     *
     */
    /*private UserDao dao;*/
    UserDao dao =new UserDaoImpl();
    /**
     * 现在的方式使用spring容器区创建dao对象
     */
    @Override
    public void SaySpring() {
     dao.SaySpring();//主业务
    }
    public UserDao getDao() {
        return dao;
    }
    public void setDao(UserDao dao) {
        System.out.println("spring创建了对象给了容器");
        this.dao = dao;
    }
}
