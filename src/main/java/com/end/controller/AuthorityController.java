package com.end.controller;

import com.end.domain.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorityController {

    @RequestMapping("/authority")
    @PreAuthorize("hasAuthority('yes')")
    public ResponseResult authority(){
        return new ResponseResult(200, "鉴权成功");
    }
}
