package com.end.mapper;

import com.end.domain.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordMapper {
    //根据用户工号查询电话记录
    List<Record> queryByUserId(@Param("job_id") Integer job_id);

    //根据记录id查询记录详情
    Record queryById(@Param("id") Integer id);

    //添加通话记录
    void addRecord(@Param("record") Record record);
}
