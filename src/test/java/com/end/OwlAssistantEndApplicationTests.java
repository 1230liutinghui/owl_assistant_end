package com.end;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class OwlAssistantEndApplicationTests {

    @Test
    void contextLoads() {

        //测试BCryptPasswordEncoder是否成功加密
        BCryptPasswordEncoder password = new BCryptPasswordEncoder();
        String encode = password.encode("1234");
        System.out.println(encode);
    }

}
