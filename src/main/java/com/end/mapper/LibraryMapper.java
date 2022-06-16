package com.end.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LibraryMapper {

    //查询所有关键词
    List<String> findAll();

    //根据最佳匹配关键词，推荐内容
    String findByKeyWord(String key_word);
}
