package com.dwh.mapper;

import com.dwh.entity.SystemAdmin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 登陆，系统管理员
 */
@Repository
public interface SystemAdminMapper {
    //登陆
    @Select("select * from system_admin where username = #{username}")
    public SystemAdmin findByUsername(String username);
}
