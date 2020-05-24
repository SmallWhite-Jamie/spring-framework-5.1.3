package com.transfer.tx;


import com.transfer.tx.bean.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lizheng
 * @date: 15:19 2019/01/15
 * @Description: HashMapTest
 */
public class HashMapTest {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("qq", "11");
//        Log log =  LogFactory.getLog(HashMapTest.class);
//        log.info(map);
        Class<?>[] interfaces = new Class<?>[] { User.class };
        Object o = Proxy.newProxyInstance(HashMapTest.class.getClassLoader(), interfaces, new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                System.out.println(proxy);
                System.out.println(method);
                System.out.println(args);
                return null;
            }
        });
        System.out.println(o);
    }
}
