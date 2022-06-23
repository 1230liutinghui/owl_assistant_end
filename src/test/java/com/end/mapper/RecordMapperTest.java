package com.end.mapper;

import com.end.domain.Record;
import com.end.service.RecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class RecordMapperTest {

    @Autowired
    private RecordService recordService;

    //测试根据工号查询用户的通话记录
    @Test
    void testqueryByUserId () {
        List<Record> records = recordService.queryByUserId(12312);
        System.out.println(records);
    }

    //测试通过记录id查询记录详情
    @Test
    void testqueryById () {
        Record record = recordService.queryById(3);
        System.out.println(record);
    }

    //测试添加记录
    @Test
    void testaddRecord () {
        Record record = new Record();
        record.setJob_id(12312);
        record.setPhone("2019");
        record.setScore(90);
        record.setStart_time(new Date());
        record.setEnd_time(new Date());
        record.setContent("加速度");
        recordService.addRecord(record);
    }
}
