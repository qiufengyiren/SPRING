package com.dzq;

/**
 * @Author 秋风伊人
 * @date 2018/9/11 14:10
 * @desc https://www.cnblogs.com/3020815dzq/
 */

public class MyAspectJ3 {
    // @Before("execution(public String eat())")

    /**
     * @Before("execution(* *..dao..*.eat())")
     * 注意：不在调用配置文件里边的service
     * 而且在测试类里边的为UserDao 不是UserService
     * 配置文件为 Spring-AspectJ2.xml
     */

    public void before() {
        System.out.println("进入了前置增强===");
        System.out.println("洗洗手吃饭了======");
    }


}
