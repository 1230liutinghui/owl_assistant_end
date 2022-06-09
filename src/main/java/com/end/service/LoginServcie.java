package com.end.service;

import com.end.domain.ResponseResult;
import com.end.domain.User;

public interface LoginServcie {

    ResponseResult login(User user);

    ResponseResult logout();

}
