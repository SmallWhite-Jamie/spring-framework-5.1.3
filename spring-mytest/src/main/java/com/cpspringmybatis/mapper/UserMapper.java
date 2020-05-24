package com.cpspringmybatis.mapper;

import com.transfer.tx.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
  @Select("SELECT * FROM users WHERE id = #{userId}")
  User getUser(@Param("userId") String userId);

  @Select("SELECT * FROM users")
  List<Map<String, Object>> query();
}