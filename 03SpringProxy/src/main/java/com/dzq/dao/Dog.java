package com.dzq.dao;

public class Dog implements  Animals {
    @Override
    public void eat() {
        System.out.println(" 我是一只狗  我爱吃骨头");
    }
}
