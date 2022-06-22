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

}
