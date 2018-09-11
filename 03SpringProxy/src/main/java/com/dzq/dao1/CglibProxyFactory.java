package com.dzq.dao1;



import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    private Object target;
    public CglibProxyFactory(Object target){
        super();
        this.target=target;
    }
    public Object getProxyInstance(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(XiaoMingStudent2.class);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, net.sf.cglib.proxy.MethodProxy methodProxy) throws Throwable {
        System.out.println("帮小明送花");
        System.out.println("帮小明送巧克力");
        Object returnValue=method.invoke(target,objects);
        System.out.println("搞定收工");
        return returnValue;
    }

    public static void main(String[] args) {
        XiaoMingStudent2 xiaoMingStudent2=new XiaoMingStudent2();
        XiaoMingStudent2 proxy=(XiaoMingStudent2) new CglibProxyFactory(xiaoMingStudent2).getProxyInstance();
        proxy.engagement();
    }
}
