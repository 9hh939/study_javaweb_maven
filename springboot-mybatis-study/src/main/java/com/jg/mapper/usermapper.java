package com.jg.mapper;

import com.jg.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface usermapper {

    @Select("select * from user")
    public List<user> list();
}
