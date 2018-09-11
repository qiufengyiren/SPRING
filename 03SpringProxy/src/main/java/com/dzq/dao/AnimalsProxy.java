package com.dzq.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AnimalsProxy implements InvocationHandler{
    private Object object;

    /**
     * 01 需要别人给我们传递一个为拖累target
     * 02: 返回一个代理对象
     */
    public Object createProxy(Object target){
        object=target;//确定委托类的类型
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     * 真正的增强
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("洗洗手===》系统级业务 （增强业务）");
        Object result=method.invoke(object,args);
        return result;
    }



    /**
     * 测试类
     */
    public static void main(String[] args) {
        //创建对象
        AnimalsProxy animalsProxy=new AnimalsProxy();
        //获取代理类对象
        Animals  dog=(Animals)animalsProxy.createProxy(new Cat());
        dog.eat();
    }


}
