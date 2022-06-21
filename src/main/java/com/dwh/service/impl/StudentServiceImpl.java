package com.dwh.service.impl;

import com.dwh.entity.Student;
import com.dwh.mapper.DormitoryMapper;
import com.dwh.mapper.StudentMapper;
import com.dwh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        //把查到的所有清空
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
}
