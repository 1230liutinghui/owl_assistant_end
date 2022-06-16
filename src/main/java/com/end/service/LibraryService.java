package com.end.service;

import javax.lang.model.element.NestingKind;
import java.util.List;

public interface LibraryService {

    //查询所有关键词
    List<String> findAll();

    //根据最佳关键词查询推荐内容
    String findByKeyWord(String key_word);
}
