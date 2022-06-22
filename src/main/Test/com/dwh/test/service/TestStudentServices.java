package com.dwh.test.service;

import com.dwh.entity.Student;
import com.dwh.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestStudentServices {
    @Autowired
    private StudentService service;
    @Test
    public void testFindAllStudent(){
        List<Student> students = service.findAllStudent();
        System.out.println("students = " + students);
    }
    @Test
    public void testSearchByNumber(){
        List<Student> students = service.search("number","01");
        System.out.println("students = " + students);
    }
    @Test
    public void testSearchByName(){
        List<Student> students = service.search("name","王伟");
        System.out.println("students = " + students);
    }
}
