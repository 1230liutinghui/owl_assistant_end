package com.end.controller;

import com.end.domain.ResponseResult;
import com.end.service.RecordService;
import com.end.domain.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/record")
@CrossOrigin
public class RecordController {
    @Autowired
    private RecordService recordService;

    @GetMapping("/queryByUserId")
    public List<Record> queryByUserId(Integer job_id) {
        return recordService.queryByUserId(job_id);
    }

    @GetMapping("/queryById")
    public Record queryById(Integer id) {
        return recordService.queryById(id);
    }

    @PostMapping("/addRecord")
    public ResponseResult addRecord(@RequestBody Record record) {
        try {
            recordService.addRecord(record);
            return new ResponseResult(200, "保存记录成功");
        } catch (Exception e) {
            return new ResponseResult(500, "保存记录失败");
        }
    }
}
