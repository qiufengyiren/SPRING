package com.dzq.service;

import com.dzq.dao.UserDao;

public class UserServiceImpl implements UserService {
    //书写dao层对象
    private UserDao dao;

    @Override
    public String sleep() {
        System.out.println("进入了ServletImpl");
        String result = dao.sleep();
        return result;
    }

    @Override
    public String eat() {
        System.out.println("进入了ServletImpl" + 5 / 0);
        String result = dao.eat();//主业务
        return result;
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
}
