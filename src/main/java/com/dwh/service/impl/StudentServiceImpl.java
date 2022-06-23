package com.dwh.service.impl;

import com.dwh.entity.Student;
import com.dwh.mapper.DormitoryMapper;
import com.dwh.mapper.StudentMapper;
import com.dwh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;
    @Autowired
    private DormitoryMapper dormitoryMapper;
    @Override
    public List<Student> findAllStudent() {
        List<Student> students = mapper.findAllStudent();
        return students;
    }

    @Override
    public List<Student> search(String key,String value) {
        if (value.equals("")){
            return this.mapper.findAllStudent();
        }
        //声明一个变量search
        List<Student> search = null;
        switch (key){
            case "number":
                search = mapper.searchByNumber(value);
                break;
            case "name":
                search = mapper.searchByName(value);
                break;
        }
        return search;
    }

    //新增学生入住
    @Override
    public void save(Student student) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        student.setCreate_date(format.format(date));
        try {
            this.mapper.save(student);
            this.dormitoryMapper.subAvailable(student.getDormitory_id());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //修改学生信息

    @Transactional
    @Override
    public void update(Student student) {
        try {
            this.mapper.update(student);
            if ((student.getDormitory_id()) != (student.getOldDormitoryId())){//如果修改了寝室号
                this.dormitoryMapper.subAvailable(student.getDormitory_id());//现在寝室床位-1
                this.dormitoryMapper.addAvailable(student.getOldDormitoryId());//原来寝室床位+1
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //删除
    @Transactional
    @Override
    public void delete(Student student) {
        try {
            mapper.delete(student.getId());
            dormitoryMapper.addAvailable(student.getDormitory_id());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
