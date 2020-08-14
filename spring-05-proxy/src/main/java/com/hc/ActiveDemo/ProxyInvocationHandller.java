package com.hc.ActiveDemo;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandller implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setRent(Object target){
        this.target=target;
    }
    //处理代理类实列，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(target,args);
        return result;
    }
    //生成得到的代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
