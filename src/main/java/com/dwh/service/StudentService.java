package com.dwh.service;

import com.dwh.entity.MoveOut;
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
    //删除,这里的形参和mapper中不一样，是为了serviceImpl中更好实现
    public void delete(Student student);


    /**
     * moveout 板块
     * @return
     */

    //查询所有在入住的学生信息，入住的就可以进行迁出操作
    public List<Student> moveOutList();

    //条件查询MoveOut
    public List<Student> searchForMoveoutList(String key, String value);

    //把学生迁出
    public void moveout(MoveOut moveout);
}
