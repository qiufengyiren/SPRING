package com.dzq.service;

import com.dzq.dao.UserDao;
import com.dzq.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.PrintWriter;

public class UserServiceImpl implements UserService {
    public UserServiceImpl (){
    }

    /**
     * 之前的耦合
     * private  UserDao dao =new UserDaoImpl();
     *
     */
    @Autowired    //找类型
    @Qualifier("userDao")   //找昵称
  private UserDao dao;
    /**
     * 之前的方式
     */
   /* UserDao dao =new UserDaoImpl();*/
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
