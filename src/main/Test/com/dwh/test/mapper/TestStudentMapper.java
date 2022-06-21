package com.dwh.test.mapper;

import com.dwh.entity.Student;
import com.dwh.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestStudentMapper {
    @Autowired
    private StudentMapper mapper;
    @Test
    public void testFindAllStudent(){
        List<Student> students = mapper.findAllStudent();
        System.out.println("students = " + students);
    }
    @Test
    public void testSearchByNumber(){
        List<Student> students = mapper.searchByNumber("01");
        System.out.println("students = " + students);
    }
    @Test
    public void testSearchByName(){
        List<Student> students = mapper.searchByName("王伟");
        System.out.println("students = " + students);
    }
    @Test
    public void testSave(){
        Student student = new Student();
        student.setName("杜雯徽");
        student.setGender("男");
        student.setNumber("20");
        student.setDormitory_id(5);
//        student.setState();
        student.setCreate_date("2022-4-18");
        mapper.save(student);
        System.out.println("student = " + student);
    }
}
