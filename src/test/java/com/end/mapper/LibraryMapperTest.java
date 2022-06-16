package com.end.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LibraryMapperTest {

    @Autowired
    private LibraryMapper libraryMapper;

    //测试根据关键词查找内容，测试通过
    @Test
    void findByKeyWord() {
        String contents = libraryMapper.findByKeyWord("什么时候可以试驾");
        System.out.println(contents);
    }

    @Test
    void findAll() {
        List<String> contents = libraryMapper.findAll();
        System.out.println(contents);
    }
}
