package com.dzq.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public String sleep() {
        System.out.println("睡觉啦");
        return "好困啊";
    }

    @Override
    public String eat() {
        System.out.println("吃东西");
        return "好吃的";
    }
}
