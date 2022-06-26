package com.dwh.mapper;

import com.dwh.entity.Absent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 缺勤记录
 */
@Repository
public interface AbsentMapper {
    //显示所有缺勤
    @Select("select a.id,b.name building_name,d.name dormitory_name,s.name student_name,a.reason,da.name dormitory_admin_name,a.create_date create_date from dormitory d,student s,building b,absent a,dormitory_admin da where d.id = a.dormitory_id and s.id = a.student_id and b.id = a.building_id and da.id = a.dormitory_admin_id")

    //精准查询
    public List<Absent> list();
    @Select("select a.id,b.name building_name,d.name dormitory_name,s.name student_name,a.reason,da.name dormitory_admin_name,a.create_date create_date from dormitory d,student s,building b,absent a,dormitory_admin da where d.id = a.dormitory_id and s.id = a.student_id and b.id = a.building_id and da.id = a.dormitory_admin_id and b.name like concat('%',#{value},'%')")
    public List<Absent> searchByBuildingName(String value);
    @Select("select a.id,b.name building_name,d.name dormitory_name,s.name student_name,a.reason,da.name dormitory_admin_name,a.create_date create_date from dormitory d,student s,building b,absent a,dormitory_admin da where d.id = a.dormitory_id and s.id = a.student_id and b.id = a.building_id and da.id = a.dormitory_admin_id and d.name like concat('%',#{value},'%')")
    public List<Absent> searchByDormitoryName(String value);

    //添加
    @Insert("insert into absent(building_id,dormitory_id,student_id,dormitory_admin_id,create_date,reason) values(#{building_id},#{dormitory_id},#{student_id},#{dormitory_admin_id},#{create_date},#{reason})")
    public void save(Absent absent);
}
