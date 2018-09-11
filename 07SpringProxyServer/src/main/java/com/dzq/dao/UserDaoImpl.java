package com.dzq.dao;

/**
 * @Author 秋风伊人
 * @date 2018/9/9 10:10
 * @desc https://www.cnblogs.com/3020815dzq/
 */
public class UserDaoImpl implements UserDao {
    @Override
    public String eat() {
        System.out.println("我正在吃水果");
        return "Apple";
    }

    @Override
    public void sleep() {
        System.out.println("我正在睡觉");
    }
}
