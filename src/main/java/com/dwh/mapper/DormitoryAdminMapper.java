package com.dwh.mapper;

import com.dwh.entity.DormitoryAdmin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    /**
     * 添加功能
     */
    @Insert("Insert into dormitory_admin (id,username,password,name,gender,telephone) values(#{id},#{username},#{password},#{name},#{gender},#{telephone})")
    public void save(DormitoryAdmin dormitoryAdmin);
    /**
     * 删除功能
     */
    @Delete("delete from dormitory_admin where id = #{id}")
    public void delete(Integer id);
    /**
     * 修改宿管信息
     */
    @Update("update dormitory_admin set username = #{username},password = #{password},name = #{name},gender = #{gender},telephone = #{telephone} where id = #{id}")
    public void update(DormitoryAdmin dormitoryAdmin);

    /**
     * 查询所有，用于宿舍管理员登陆
     * @param username
     * @return
     */
    @Select("select * from dormitory_admin where username = #{username}")
    public DormitoryAdmin findByUsername(String username);
}
