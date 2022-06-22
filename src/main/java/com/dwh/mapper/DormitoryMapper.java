package com.dwh.mapper;

import com.dwh.entity.Dormitory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DormitoryMapper {
    /**
     * 查询床位可用的宿舍信息
     * @return
     */
    @Select("select id,name from dormitory where available > 0")
    public List<Dormitory> availableList();

    /**
     * 查询所有的宿舍
     */
    @Select("select * from dormitory d,building b where d.building_id = b.id")
    public List<Dormitory> list();
    /**
     * 可用宿舍号,
     * 不是单独功能，为的是给增加学生住宿使用，主要是提供一个可以使用的宿舍号
     */
    @Update("update dormitory set available = available-1 where id = #{id}")
    public void subAvailable(Integer id);//可用床位-1

    @Update("update dormitory set available = available+1 where id = #{id}")
   public void addAvailable(int oldDormitory_id);//可用床位+1
}
