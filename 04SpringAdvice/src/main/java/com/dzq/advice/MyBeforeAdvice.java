package com.dzq.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置增强
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    /**
     * @param method  需要的增强的方法
     * @param objects 方法的参数
     * @param target  目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("进入了前置通知");
        //  System.out.println("method--》》"+method.getName());
        //System.out.println("target--->>"+target.getClass().getSimpleName());
    }
}
