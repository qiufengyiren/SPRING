package com.dzq.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @Author 秋风伊人
 * @date 2018/9/7 12:00
 * @desc https://www.cnblogs.com/3020815dzq/
 */


/**
 * 异常配置
 */
public class MyExceptionAdvice  implements ThrowsAdvice{
    public void afterThrowing(Exception ex){
        System.out.println(ex.getMessage());
    }
}
