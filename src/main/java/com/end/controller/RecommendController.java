package com.end.controller;

import com.end.domain.ResponseResult;
import com.end.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import static com.end.utils.SimilarityUtil.getSimilarity;

@RestController
public class RecommendController {
    @Autowired
    private LibraryService libraryService;

    @GetMapping("/recommend")
    public ResponseResult findByKeyWord(String str) {
        //查找所有关键词
        List<String> keys = libraryService.findAll();
        //存储关键词和相应的相似度
        Map<String, Double> key_similarity = new HashMap<>();
        for (String key:
             keys) {
            double similarity = getSimilarity(str, key);
            key_similarity.put(key, similarity);
        }
        //对key_similarity进行排序
        List<Map.Entry<String, Double>> key_sim_list = new ArrayList<Map.Entry<String, Double>>(key_similarity.entrySet());
        //根据value排序
        Collections.sort(key_sim_list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                if ((o2.getValue() - o1.getValue()) > 0)
                    return 1;
                else if((o2.getValue() - o1.getValue()) == 0)
                    return 0;
                else
                    return -1;
            }
        });
        //取前3项
        List<Map.Entry<String, Double>> entries = key_sim_list.subList(0, 3);
        //保存关键词
        List<String> best_question = new ArrayList<>();
        //推荐内容
        List<String> contents = new ArrayList<>();
        //根据关键词查找推荐内容
        for (Map.Entry<String, Double> item:
             entries) {
            String item_key = item.getKey();
            String content = libraryService.findByKeyWord(item_key);
            contents.add(content);
            best_question.add(item_key);
        }
        //返回数据
        Map<String, List<String>> data = new HashMap<>();
        data.put("key_word", best_question);
        data.put("content", contents);
        return new ResponseResult(200, data);
    }
}
