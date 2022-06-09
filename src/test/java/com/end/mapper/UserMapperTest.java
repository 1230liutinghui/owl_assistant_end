package com.end.mapper;

import com.end.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByName() {
        User user = userMapper.findByName("liu");
        System.out.println(user);
    }
}
