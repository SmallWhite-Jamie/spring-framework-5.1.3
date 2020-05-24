package com.transfer.jdkproxy;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lizheng
 * @date: 18:36 2019/01/31
 * @Description: MyInvocationHandler
 */
public class MyInvocationHandler<T> implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, args);
        }
        String sql = method.getAnnotation(Select.class).value()[0];
        System.out.println("连接数据库");
        System.out.println(args[0]);
        System.out.println(sql);
        System.out.println("查询成功");
        return 1;
    }
}
