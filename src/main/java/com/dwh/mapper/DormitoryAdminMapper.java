package com.dwh.mapper;

import com.dwh.entity.DormitoryAdmin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 宿管管理
 */
@Repository
public interface DormitoryAdminMapper {
    /**
     * 查询所有宿管
     */
    @Select("select * from dormitory_admin")
    public List<DormitoryAdmin> list();
    /**
     * 模糊查询，根据搜索内容进行查询
     */
    //根据用户名称查询
    @Select("select * from dormitory_admin where username like concat('%',#{value},'%')")
    public List<DormitoryAdmin> searchByUsername(String value);
    //根据真实名称查询
    @Select("select * from dormitory_admin where name like concat('%',#{value},'%')")
    public List<DormitoryAdmin> searchByName(String value);
    //根据电话号码查询
    @Select("select * from dormitory_admin where telephone like concat('%',#{value},'%')")
    public List<DormitoryAdmin> searchByTelephone(String value);

}
