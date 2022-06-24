package com.dwh.controller;

import com.dwh.entity.Student;
import com.dwh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/moveout")
public class MoveOutController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList = studentService.moveOutList();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("moveoutregister");
        return modelAndView;
    }

    @RequestMapping("/search")
    public ModelAndView search(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList = studentService.searchForMoveoutList(key, value);
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("moveoutregister");
        return modelAndView;
    }
}
