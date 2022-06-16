package com.end.service.impl;

import com.end.domain.Record;
import com.end.mapper.RecordMapper;
import com.end.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;

    // 根据用户的工号查询电话记录
    @Override
    public List<Record> queryByUserId(Integer job_id) {
        return recordMapper.queryByUserId(job_id);
    }

    //根据记录的id查询记录详情
    @Override
    public Record queryById(Integer id) {
        return recordMapper.queryById(id);
    }

    @Override
    public void addRecord(Record record) {
        recordMapper.addRecord(record);
    }

}
