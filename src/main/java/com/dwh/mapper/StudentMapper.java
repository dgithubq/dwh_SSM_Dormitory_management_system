package com.dwh.mapper;

import com.dwh.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学生信息管理
 */
@Repository
public interface StudentMapper {
    //查询所有学生的住宿信息
    @Select("select s.id,s.number,s.name name,s.gender,s.dormitory_id dormitory_id,d.name dormitoryName,s.state,s.create_date create_date from student s,dormitory d where s.dormitory_id = d.id")
    List<Student> findAllStudent();
    //根据number查询
    @Select("select * from student s,dormitory d where s.dormitory_id = d.id and s.number like concat('%',#{value},'%')")
    public List<Student> searchByNumber(String value);
    //根据名字搜索
    @Select("select * from student s,dormitory d where s.dormitory_id = d.id and s.name like concat('%',#{value},'%')")
    public List<Student> searchByName(String value);

    //添加新的学生住宿信息
    @Insert("Insert into student(number,name,gender,dormitory_id,state,create_date) values(#{number},#{name},#{gender},#{dormitory_id},'入住',#{create_date})")
    public void save(Student student);

    //修改学生住宿信息
    @Update("update Student set number = #{number},name = #{name},gender = #{gender},dormitory_id = #{dormitory_id} where id = #{id}")
    public void update(Student student);

    //删除学生住宿信息
    @Delete("delete from student where id = #{id}")
    public void delete(Integer id);

    //根据dormitoryId查询学生
    @Select("select id from student where dormitory_id = #{dormitoryId}")
    public List<Integer> findStudentIdByDormitoryId(Integer dormitoryId);

    //更新学生床位
    @Select("update student set dormitory_id = #{param2} where id = #{param1}")
    public void resetDormitoryId(Integer studentId, Integer availableDormitoryId);

    //查询住宿状态是入住的学生信息（为了给迁出学生那一版块显示信息）
    @Select("select s.id,s.number,s.name name,s.gender,s.dormitory_id dormitory_id,d.name dormitoryName,s.state from student s,dormitory d where s.dormitory_id = d.id and s.state = '入住'")
    public List<Student> moveOutList();

    //根据条件查询moveout
    @Select("select s.id,s.number,s.name name,s.gender,s.dormitory_id dormitory_id,d.name dormitoryName,s.state from student s,dormitory d where s.dormitory_id = d.id and s.state = '入住' and s.number like concat('%',#{value},'%')")
    public List<Student> searchForMoveoutByNumber(String value);
    @Select("select s.id,s.number,s.name name,s.gender,s.dormitory_id dormitory_id,d.name dormitoryName,s.state from student s,dormitory d where s.dormitory_id = d.id and s.state = '入住' and s.name like concat('%',#{value},'%')")
    public List<Student> searchForMoveoutByName(String value);
}
