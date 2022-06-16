package com.end.service;

import com.end.domain.Record;

import java.util.List;

public interface RecordService {

    //查询当前用户的邀约记录
    List<Record> queryByUserId(Integer job_id);

    //根据记录id查询记录详情
    Record queryById(Integer id);

    //添加记录
    void addRecord(Record record);

}
