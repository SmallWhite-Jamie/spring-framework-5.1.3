package com.transfer.jdkproxy;

import org.apache.ibatis.annotations.Select;

/**
 * @author lizheng
 * @date: 18:50 2019/01/31
 * @Description: MyInterface
 */
public interface MyInterface {

    @Select("select xxxxx")
    int query(String id);
}
