package com.dwh.mapper;

import com.dwh.entity.MoveOut;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学生迁出管理
 */
@Repository
public interface MoveOutMapper {
    @Select("select m.id,s.name studentName,d.name dormitoryName,m.reason,m.create_date create_date from moveout m,student s,dormitory d where m.student_id = s.id and m.dormitory_id = d.id")
    public List<MoveOut> list();
}
