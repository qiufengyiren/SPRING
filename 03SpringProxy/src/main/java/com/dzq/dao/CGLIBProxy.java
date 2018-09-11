package com.dzq.dao;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();

    /**
     * 根据用户传递委托类 返回一个代理类
     */
    public Object createProxy(Class clazz) {
        //设置公共的父类或者是接口
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("洗洗手===》系统级业务 （增强业务）");
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }


    /**
     * 测试类
     */
    public static void main(String[] args) {
        //创建对象
        CGLIBProxy cglibProxy = new CGLIBProxy();
        //获取代理类对象
        Dog dog = (Dog) cglibProxy.createProxy(Dog.class);
        dog.eat();
    }

}
