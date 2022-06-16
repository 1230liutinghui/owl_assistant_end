package com.end.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private int id;       //记录id

    private int job_id;     //工号

    //客户联系方式
    private String phone;

    // 员工评价分数
    private int score;

    //开始时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date start_time;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // 结束时间
    private Date end_time;
}

