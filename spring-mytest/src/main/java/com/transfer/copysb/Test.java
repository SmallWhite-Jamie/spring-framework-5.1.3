package com.transfer.copysb;

import org.apache.catalina.LifecycleException;

/**
 * @author lizheng
 * @date: 14:57 2019/03/15
 * @Description: Test
 */
public class Test {
    public static void main(String[] args) {
        try {
            ImitateSpringboot.run();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
