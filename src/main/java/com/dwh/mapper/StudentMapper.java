package com.dwh.mapper;

import com.dwh.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    //查询所有学生的住宿信息
    @Select("select * from student s,dormitory d where s.dormitory_id = d.id")
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
}
