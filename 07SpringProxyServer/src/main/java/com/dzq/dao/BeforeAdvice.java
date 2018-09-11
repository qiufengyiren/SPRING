package com.dzq.dao;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author 秋风伊人
 * @date 2018/9/9 10:12
 * @desc https://www.cnblogs.com/3020815dzq/
 */
public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行了前置通知");
    }
}
