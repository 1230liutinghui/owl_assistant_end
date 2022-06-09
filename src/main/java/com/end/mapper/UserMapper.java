package com.end.mapper;

import com.end.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findByName(String name);
}
