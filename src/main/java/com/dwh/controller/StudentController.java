package com.dwh.controller;

import com.dwh.entity.Dormitory;
import com.dwh.entity.Student;
import com.dwh.service.DormitoryService;
import com.dwh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;
    @Autowired
    private DormitoryService dormitoryService;
    //查询所有的学生住宿信息
    @RequestMapping("/findAllStudent")
    public ModelAndView findAllStudent(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = service.findAllStudent();
//        System.out.println("students = " + students);
        List<Dormitory> dormitoryList = dormitoryService.availableList();
        modelAndView.addObject("students",students);
        modelAndView.addObject("dormitoryList",dormitoryList);
        modelAndView.setViewName("studentmanager");
        return modelAndView;
    }
    //根据number或者name查询
    @RequestMapping("/search")
    public ModelAndView searchByNum(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = service.search(key,value);
        List<Dormitory> dormitoryList = dormitoryService.availableList();
        modelAndView.addObject("students",students);
        modelAndView.addObject("dormitoryList",dormitoryList);
        modelAndView.setViewName("studentmanager");
        return modelAndView;
    }

    //添加
    @RequestMapping("/save")
    public String save(Student student){
        service.save(student);
        return "redirect:/student/findAllStudent";
    }

    @RequestMapping("/update")
    public String update(Student student){
        service.update(student);
        return "redirect:/student/findAllStudent";
    }

    @RequestMapping("/delete")
    public String delete(Student student){
        service.delete(student);
        return "redirect:/student/findAllStudent";
    }
}
