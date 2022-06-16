package com.end.service.impl;

import com.end.mapper.LibraryMapper;
import com.end.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    //定义一个LibraryService
    @Autowired
    private LibraryMapper libraryMapper;

    @Override
    public List<String> findAll() {
        return libraryMapper.findAll();
    }

    @Override
    public String findByKeyWord(String key_word) {
        return libraryMapper.findByKeyWord(key_word);
    }

}
