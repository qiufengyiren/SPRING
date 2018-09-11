package com.dzq.dao;

public class Cat implements Animals {
    @Override
    public void eat() {
        System.out.println("我是一只猫 我爱吃鱼");
    }
}
