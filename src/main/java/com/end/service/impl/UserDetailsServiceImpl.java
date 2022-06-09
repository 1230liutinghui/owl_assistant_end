package com.end.service.impl;

import com.end.domain.LoginUser;
import com.end.domain.User;
import com.end.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //查询用户信息
        User user = userMapper.findByName(username);
        //如果没有查询到用户就抛出异常
        if(user == null){
            throw new RuntimeException("用户名或者密码错误");
        }

        //把数据封装成UserDetails返回
        return new LoginUser(user);
    }
}
