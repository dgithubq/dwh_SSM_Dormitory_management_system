package com.dwh.mapper;

import com.dwh.entity.Building;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 楼宇管理
 */
@Repository
public interface BuildingMapper {
    /**
     * 查询所有楼宇
     */
    @Select("select b.id id,b.name name,b.introduction,d.name adminName,d.id admin_id from building b,dormitory_admin d where b.admin_id = d.id")
    public List<Building> list();
    /**
     * 根据名字搜索楼宇
     */
    @Select("select b.id id,b.name name,b.introduction,d.name adminName,d.id admin_id from building b,dormitory_admin d where b.admin_id = d.id and b.name like concat('%',#{value},'%')")
    public List<Building> searchByName(String value);
    /**
     * 根据楼宇介绍搜索楼宇
     */
    @Select("select b.id id,b.name name,b.introduction,d.name adminName,d.id admin_id from building b,dormitory_admin d where b.admin_id = d.id and b.introduction like concat('%',#{value},'%') ")
    public List<Building> searchByIntroduction(String value);

    /**
     * 添加
     * @param building
     */
    @Insert(" insert into building(name,introduction,admin_id) values(#{name},#{introduction},#{admin_id})")
    public void save(Building building);

    /**
     * 修改楼宇信息
     * @param building
     */
    @Update("update building set name = #{name},introduction = #{introduction},admin_id = #{admin_id} where id = #{id}")
    public void update(Building building);

    /**
     * 删除
     * @param id
     */
    @Delete("delete from building where id = #{id};")
    public void delete(Integer id);
}
