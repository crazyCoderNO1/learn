package com.learn.mapper;

import com.learn.pojo.Dept;
import com.learn.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper extends MyMapper<Dept> {
}