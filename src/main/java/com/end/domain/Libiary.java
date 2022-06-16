package com.end.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libiary {

    //知识库记录的id
    private Integer id;

    //内容的关键词
    private String key_word;

    //关键词相关的具体内容
    private String content;

}
