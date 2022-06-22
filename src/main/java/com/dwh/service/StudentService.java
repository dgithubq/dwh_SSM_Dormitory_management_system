package com.dwh.service;

import com.dwh.entity.Student;

import java.util.List;
public interface StudentService {
    //查询所有的学生住宿信息
    public List<Student> findAllStudent();
    //根据number或者name查询
    public List<Student> search(String key,String value);
    //添加
    public void save(Student student);
    //修改
    public void update(Student student);


}
