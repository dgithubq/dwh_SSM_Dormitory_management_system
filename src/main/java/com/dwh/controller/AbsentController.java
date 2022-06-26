package com.dwh.controller;

import com.dwh.entity.Absent;
import com.dwh.entity.Building;
import com.dwh.entity.Dormitory;
import com.dwh.entity.Student;
import com.dwh.service.AbsentService;
import com.dwh.service.BuildingService;
import com.dwh.service.DormitoryService;
import com.dwh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/absent")
public class AbsentController {
    @Autowired
    private AbsentService absentService;
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private DormitoryService dormitoryService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Absent> list = absentService.list();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("absentrecord");
        return modelAndView;
    }

    @RequestMapping("/search")
    public ModelAndView search(String key,String value){
        ModelAndView modelAndView = new ModelAndView();
        List<Absent> search = absentService.search(key, value);
        modelAndView.addObject("list",search);
        modelAndView.setViewName("absentrecord");
        return modelAndView;
    }

    @RequestMapping("/into")
    public ModelAndView into(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("absentregister");
        List<Building> buildingList = this.buildingService.list();
        modelAndView.addObject("buildingList", buildingList);
        List<Dormitory> dormitoryList = this.dormitoryService.findByBuildingId(buildingList.get(0).getId());
        modelAndView.addObject("dormitoryList", dormitoryList);
        List<Student> studentList = this.studentService.findByDormitoryId(dormitoryList.get(0).getId());
        modelAndView.addObject("studentList", studentList);
        return modelAndView;
    }
}
