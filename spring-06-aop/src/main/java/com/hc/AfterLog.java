package com.hc;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName()+"DE"+method.getName()+"被执行了，返回值为"+returnValue);
    }
}
