package com.dzq.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public String eat() {
        System.out.println("吃东西");
        return "好吃的";
    }
}
