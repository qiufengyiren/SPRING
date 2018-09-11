package com.dzq.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
/**
 * 后置增强
 */
public class MyAfterAdvice implements AfterReturningAdvice {
    /**
     *
     * @param o   对象
     * @param method   方法
     * @param objects
     * @param o1
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置增强");
    }
}
