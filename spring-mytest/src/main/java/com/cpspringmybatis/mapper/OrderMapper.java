package com.cpspringmybatis.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface OrderMapper {
  @Select("SELECT * FROM order")
  List<Map<String, Object>> query();
}